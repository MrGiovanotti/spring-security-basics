package com.mrgiovanotti.securitybasics.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrgiovanotti.securitybasics.entities.User;
import com.mrgiovanotti.securitybasics.repositories.UserRepository;
import com.mrgiovanotti.securitybasics.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public Optional<User> findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
