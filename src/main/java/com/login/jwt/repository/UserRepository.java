package com.login.jwt.repository;

import com.login.jwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,Integer> {
    Optional<User> findOneByEmail(String email);
}
