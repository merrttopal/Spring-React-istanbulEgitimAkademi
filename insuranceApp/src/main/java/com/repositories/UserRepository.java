package com.repositories;

import com.entities.User;
import com.entities.projection.IUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailEqualsIgnoreCase(String email);

    Optional<User> findByEmailEqualsIgnoreCaseAndPasswordEquals(String email, String password);

    @Query(value = "select u.uid, u.email, u.password FROM user_entitiy as u\n" +
            "    inner join user_entitiy_role uer on u.uid = uer.user_entitiy_uid inner join role r on uer.role_rid = r.rid\n" +
            "                                  where u.email = ?1 and u.password = ?2\n"
            , nativeQuery = true)
    IUser user(String email, String password);

    boolean existsByEmailEqualsIgnoreCase(String email);
}