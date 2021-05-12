package MyPractice.core.scenario1.order;

import MyPractice.core.scenario1.member.Member;

public interface OrderService {

    int order(Member member, String item, int price);

}
