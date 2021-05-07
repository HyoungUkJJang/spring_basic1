package hello2.core.discount;

import hello2.core.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
