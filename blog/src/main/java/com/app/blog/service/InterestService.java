package com.app.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.blog.model.Interest;
import com.app.blog.model.Post;

@Service
public interface InterestService {
	
	List<Interest> getAllInterests();
	Interest addInterest(Interest interest);
	Optional<Interest> getInterest(int id);
	
}
