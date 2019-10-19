package com.app.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.blog.model.Post;

@Service
public interface BlogService {
	
	List<Post> getAllPosts();
	
}
