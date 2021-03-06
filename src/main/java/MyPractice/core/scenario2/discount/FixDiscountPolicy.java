package MyPractice.core.scenario2.discount;

import MyPractice.core.scenario2.member.Grade;
import MyPractice.core.scenario2.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    //고정할인정책
    @Override
    public int discount(Member member, int price) {
     if(member.getGrade() == Grade.VIP)
     {
         return 1000;
     }
     else{
         return 0;
     }
    }

}
