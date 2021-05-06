package Mypackage.shoes;

import Mypackage.user.Kinds;
import Mypackage.user.User;

public interface ShoesSpeedPolicy {

    int speed(User user, Kinds kinds);

}
