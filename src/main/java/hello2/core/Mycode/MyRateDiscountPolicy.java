package hello2.core.Mycode;

import hello2.core.discount.DiscountPolicy;
import hello2.core.member.Grade;
import hello2.core.member.Member;

public class MyRateDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price/10;
        }
        else
        {
           // return price; 아하 할인 메소드여서 가격이아닌 0으로 리턴
            return 0;
        }
    }
}
