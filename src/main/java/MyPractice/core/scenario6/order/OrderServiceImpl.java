package MyPractice.core.scenario6.order;
import MyPractice.core.scenario6.discount.DiscountPolicy;
import MyPractice.core.scenario6.discount.MainDiscountPolicy;
import MyPractice.core.scenario6.member.Member;
import MyPractice.core.scenario6.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {


    private final MemberRepository memberRepository;

    private final DiscountPolicy discountPolicy;


    @Override
    public Order createOrder(Long memberId, String itemName, int price) {
        Member member = memberRepository.find(memberId);
        System.out.println("member = " + member);
        int discount = discountPolicy.discount(member,price);

        return new Order(memberId, itemName, price, discount);

    }
}
