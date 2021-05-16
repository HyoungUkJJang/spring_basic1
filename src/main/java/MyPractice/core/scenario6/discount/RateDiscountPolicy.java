package MyPractice.core.scenario6.discount;

import MyPractice.core.scenario6.member.Grade;
import MyPractice.core.scenario6.member.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10; // 10% 할인적용

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
        }
        else
        {
            return 0;
        }
    }
}
