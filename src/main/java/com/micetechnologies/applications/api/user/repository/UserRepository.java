package com.micetechnologies.applications.api.user.repository;



import com.micetechnologies.applications.api.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Petri Kainulainen
 */
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
