package Mypackage.user;

public interface UserRepository {

    void join(User user);

    User find(String userId);


}
