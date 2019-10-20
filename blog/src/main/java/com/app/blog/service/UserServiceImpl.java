package com.app.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.blog.model.User;
import com.app.blog.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepo.findAll();
	}

	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public Optional<User> getUser(Long id) {
		return userRepo.findById(id);
	}

}
