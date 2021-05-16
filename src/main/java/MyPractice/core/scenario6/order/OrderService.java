package MyPractice.core.scenario6.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
