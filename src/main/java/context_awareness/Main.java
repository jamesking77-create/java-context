package context_awareness;

import context_awareness.config.AppConfig;
import context_awareness.repositories.AppUserRepository;
import context_awareness.services.AppUserService;
import context_awareness.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        var userRepository =  (AppUserRepository)context.getBean(AppUserRepository.class);
        System.out.println(userRepository);

        UserService userService = context.getBean(AppUserService.class);
        System.out.println(userService);
    }
}
