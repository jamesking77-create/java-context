package context_awareness.services;

import context_awareness.model.User;
import context_awareness.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AppUserService implements UserService{
    @Autowired
    public AppUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Autowired
    private UserRepository userRepository;
    @Override
    public void register() {
        userRepository.save(new User(1, "james"));

    }
}
