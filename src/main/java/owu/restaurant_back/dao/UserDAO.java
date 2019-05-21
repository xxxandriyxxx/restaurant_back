package owu.restaurant_back.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import owu.restaurant_back.models.User;

@Repository
public interface UserDAO extends JpaRepository<User,Integer> {

//    @Query(" select  u from User u where u.username=:name")
//    User findByUsername (@Param("username") String name);

    User findByUsername(String username);
}
