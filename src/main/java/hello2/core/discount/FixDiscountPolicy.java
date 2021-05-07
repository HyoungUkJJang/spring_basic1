package hello2.core.discount;

import hello2.core.member.Grade;
import hello2.core.member.Member;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("fixDiscountPolicy")
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) // 이넘타입은 ==을쓴다.
        {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
