package Mypackage.user;

public interface UserRepository {

    void save(User user);

    User find(Long userId);



}
