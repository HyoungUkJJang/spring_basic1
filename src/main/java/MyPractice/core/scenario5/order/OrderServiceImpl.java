package MyPractice.core.scenario5.order;
import MyPractice.core.scenario5.discount.DiscountPolicy;
import MyPractice.core.scenario5.member.Member;
import MyPractice.core.scenario5.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    // 방법1 private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    // private final DiscountPolicy discountPolicy = new RateDiscountPolicy(); 클라이언트의 소스에 수정이 일어난다. 문제가 발생함
    // private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 방법2
    //    private MemberRepository memberRepository;
    //    private DiscountPolicy discountPolicy;
    //
    //    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
    //        this.memberRepository = memberRepository;
    //        this.discountPolicy = discountPolicy;
    //    }

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int price) {
        //Member member1 = new Member(1L, "memberA", Grade.VIP);
        Member member = memberRepository.find(memberId);
        System.out.println("member = " + member);
        int discount = discountPolicy.discount(member,price);

        return new Order(memberId, itemName, price, discount);
//        return new Order(2L, "ex",10000, 1000);

    }
}
