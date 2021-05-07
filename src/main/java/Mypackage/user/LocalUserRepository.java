package Mypackage.user;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalUserRepository implements  UserRepository{

    Map<Long, User> userMap = new HashMap<>();

    @Override
    public void save(User user) {

        userMap.put(user.getId(), user);

    }

    @Override
    public User find(Long userId) {

        User findUSer = userMap.get(userId);
        return findUSer;
    }

}
