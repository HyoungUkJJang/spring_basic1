package MyPractice.core.scenario4.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
