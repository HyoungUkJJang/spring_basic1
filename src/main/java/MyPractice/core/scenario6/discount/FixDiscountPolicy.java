package MyPractice.core.scenario6.discount;

import MyPractice.core.scenario6.member.Grade;
import MyPractice.core.scenario6.member.Member;
import org.springframework.stereotype.Component;

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
