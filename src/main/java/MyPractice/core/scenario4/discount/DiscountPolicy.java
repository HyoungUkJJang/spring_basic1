package MyPractice.core.scenario4.discount;

import MyPractice.core.scenario4.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
