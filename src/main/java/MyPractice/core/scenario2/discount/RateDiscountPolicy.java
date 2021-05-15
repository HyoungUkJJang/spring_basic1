package MyPractice.core.scenario2.discount;

import MyPractice.core.scenario1.member.Grade;
import MyPractice.core.scenario1.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {


    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return 1000;
        }
        else
        {
            return 0;
        }
    }
}
