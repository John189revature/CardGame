package Project2.DAO;

import Project2.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;


@Component
public interface UserRepository extends JpaRepository<User, Integer> {


    @Query("from Users")
    User findUserById(@Param("userId") int id);

    @Query("from Users where username = :username")
    User findUsername(@Param("username") String name);

    @Query("from Users where avatarURL = :avatarurl")
    User findAvatarURL(@Param("avatarurl") String name);

    @Query("from Users where password = :password")
    User findPassword(@Param("password") String name);

    @Query("from Users where tryId = :tryId")
    User findTryId(@Param("tryId") int id);
}
