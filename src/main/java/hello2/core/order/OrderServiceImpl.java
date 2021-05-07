package hello2.core.order;

import hello2.core.discount.DiscountPolicy;
import hello2.core.member.Member;
import hello2.core.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final DiscountPolicy discountPolicy; // 하지만 널포인트에러가 터진다
    private final MemberRepository memberRepository;
    // 정책이 변경되엇을때 클라이언트 쪽의 소스를 변경해야한다 하지만 현재 DIP를 위반하고 있으면서 소스를 수정하는 순간 OCP까지 위반하게된다.
    // 어떻게 해결이 가능할까..

    //private final DiscountPolicy discountPolicy = new MyRateDiscountPolicy();
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy(); // 바뀌는 순간 OCP위반이다


    /**
     * 방법 ! 전반적인 설정(구현)을 담당해주는 파일을 하나 생성하자 ! Appconfig
     */

    /**
     * 롬복으로 다 해결해준다
     */
    // 오더서비스 또한 메모리 멤버 리포지토리를 쓴다. 디스카운트폴리시까지 함께
//    @Autowired // 생략해도 생성자가 하나면 스프링이 관리하는 빈이라면 자동으로 생성해서 주입한다. 최근추세임
//    public OrderServiceImpl(DiscountPolicy discountPolicy, MemberRepository memberRepository) {
//        this.discountPolicy = discountPolicy;
//        this.memberRepository = memberRepository;
//    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    // 테스트용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
