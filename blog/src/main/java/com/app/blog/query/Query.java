package com.app.blog.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.blog.model.Interest;
import com.app.blog.model.Post;
import com.app.blog.model.User;
import com.app.blog.service.BlogService;
import com.app.blog.service.InterestService;
import com.app.blog.service.UserService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
@Component
public class Query implements GraphQLQueryResolver{

	@Autowired
	private BlogService blogService;
	@Autowired
	private UserService userService;
	@Autowired
	private InterestService interestService;
	
	public List<Interest> allInterests() {
		return interestService.getAllInterests();
	}
	
	public List<User> allUsers() {
		return userService.getAllUsers();
	}
	
	public List<Post> allPosts() {
		return blogService.getAllPosts();
	}
}
