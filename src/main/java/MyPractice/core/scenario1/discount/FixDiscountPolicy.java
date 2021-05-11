package MyPractice.core.scenario1.discount;

import MyPractice.core.scenario1.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    //고정할인정책
    @Override
    public int disount(Member member, int price) {
        return 1000;
    }

}
