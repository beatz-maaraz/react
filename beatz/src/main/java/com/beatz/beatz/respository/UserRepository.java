package com.beatz.beatz.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beatz.beatz.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}