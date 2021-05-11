package MyPractice.core.scenario1.discount;

import MyPractice.core.scenario1.member.Grade;
import MyPractice.core.scenario1.member.Member;

public interface DiscountPolicy {

    int disount(Member member,int price);

}
