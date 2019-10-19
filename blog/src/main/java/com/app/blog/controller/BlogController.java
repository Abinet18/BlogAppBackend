package com.app.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.blog.model.Post;
import com.app.blog.service.BlogService;

@RestController
public class BlogController {
	
	@Autowired 
	private BlogService blogService;
	
	@GetMapping("/blogs") 
	List<Post> getAllPosts() {
		return blogService.getAllPosts();
	}
	

}
