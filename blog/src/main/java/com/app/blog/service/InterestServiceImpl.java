package com.app.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.blog.model.Interest;
import com.app.blog.repository.InterestRepository;
@Service
public class InterestServiceImpl implements InterestService {
	
	@Autowired
	InterestRepository interestRepo;

	@Override
	public List<Interest> getAllInterests() {
		return (List<Interest>) interestRepo.findAll();
	}

	@Override
	public Interest addInterest(Interest interest) {
		return interestRepo.save(interest);
	}

	@Override
	public Optional<Interest> getInterest(int id) {
		return interestRepo.findById(id);
	}

}
