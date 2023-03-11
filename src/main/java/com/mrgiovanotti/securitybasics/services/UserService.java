package com.mrgiovanotti.securitybasics.services;

import java.util.Optional;

import com.mrgiovanotti.securitybasics.entities.User;

public interface UserService {

	Optional<User> findByUsername(String username);

}
