package com.micetechnologies.applications.appname.user.repository;



import com.micetechnologies.applications.appname.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Petri Kainulainen
 */
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
