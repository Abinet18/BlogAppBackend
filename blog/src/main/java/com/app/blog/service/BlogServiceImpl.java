package com.app.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.blog.model.Post;
import com.app.blog.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	BlogRepository br;

	@Override
	public List<Post> getAllPosts() {
			return (List<Post>)br.findAll();
	}

}
