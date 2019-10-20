package com.app.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.blog.model.User;

@Service
public interface UserService {
	
	List<User> getAllUsers();
	User addUser(User user);
	Optional<User> getUser(Long id);
	
}
