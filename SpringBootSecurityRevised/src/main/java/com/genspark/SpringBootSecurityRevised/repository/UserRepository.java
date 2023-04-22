package com.genspark.SpringBootSecurityRevised.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.genspark.SpringBootSecurityRevised.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
