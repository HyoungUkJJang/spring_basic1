package MyPractice.core.scenario1.order;

import MyPractice.core.scenario1.member.Member;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
