package Mypackage.order;

import Mypackage.user.User;

public interface OrderService {

    int order(User user, String orderName, int price);
}
