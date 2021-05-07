package Mypackage.user;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void join(User user) {
        userRepository.save(user);
    }

    @Override
    public User findUser(Long userId) {
        User user = userRepository.find(userId);
        return user;
    }


}
