package MyPractice.core.scenario5.discount;

import MyPractice.core.scenario5.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
