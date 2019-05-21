package owu.restaurant_back.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import owu.restaurant_back.models.User;

public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
