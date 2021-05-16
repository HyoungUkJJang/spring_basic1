package MyPractice.core.scenario6.discount;

import MyPractice.core.scenario6.member.Member;
import org.springframework.beans.factory.annotation.Autowired;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
