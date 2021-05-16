package MyPractice.core.scenario5.discount;

import MyPractice.core.scenario5.member.Grade;
import MyPractice.core.scenario5.member.Member;

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
