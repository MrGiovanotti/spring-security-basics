package com.mrgiovanotti.securitybasics.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrgiovanotti.securitybasics.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String username);

}
