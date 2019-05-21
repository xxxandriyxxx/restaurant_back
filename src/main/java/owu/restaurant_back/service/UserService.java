package owu.restaurant_back.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import owu.restaurant_back.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void save(User user);

    List<User> findAll();

    User findOneById(Integer id);
}
