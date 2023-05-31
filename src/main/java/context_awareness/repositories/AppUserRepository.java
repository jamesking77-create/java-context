package context_awareness.repositories;

import context_awareness.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class AppUserRepository implements UserRepository{
    @Override
    public void save(User user) {
        System.out.println("saving user:: " + user);
    }
}
