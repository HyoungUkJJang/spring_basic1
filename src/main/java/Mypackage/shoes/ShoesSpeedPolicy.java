package Mypackage.shoes;

import Mypackage.trash.Kinds;
import Mypackage.user.User;

public interface ShoesSpeedPolicy {

    int speed(User user, Kinds kinds);

}
