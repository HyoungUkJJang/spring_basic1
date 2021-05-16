package MyPractice.core.scenario3.discount;

import MyPractice.core.scenario3.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
