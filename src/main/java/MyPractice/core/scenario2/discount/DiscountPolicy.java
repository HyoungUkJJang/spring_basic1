package MyPractice.core.scenario2.discount;

import MyPractice.core.scenario2.member.Member;

public interface DiscountPolicy {

    int discount(Member member,int price);

}
