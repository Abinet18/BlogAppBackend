package com.app.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.blog.model.Comment;
import com.app.blog.model.Interest;
import com.app.blog.model.Like;
import com.app.blog.model.Post;
import com.app.blog.model.User;
import com.app.blog.service.BlogService;
import com.app.blog.service.InterestService;
import com.app.blog.service.UserService;

@RestController
public class BlogController {
	
	@Autowired 
	private BlogService blogService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private InterestService interestService;
	
	@GetMapping("/blogs") 
	List<Post> getAllPosts() {
		return blogService.getAllPosts();
	}
	
	@GetMapping("/interests") 
	List<Interest> getAllInterests() {
		return interestService.getAllInterests();
	}

	@GetMapping("/users") 
	List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/user/add")
	User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PostMapping("/interest/add")
	Interest addInterest(@RequestBody Interest interest) {
		return interestService.addInterest(interest);
	}
	
	@PostMapping("/blog/add")
	Post addPost(@RequestBody Post post) {
		return blogService.addPost(post);
	}   
	
	@PostMapping("/blog/like")
	Post likePost(@RequestBody Like like )
	{
		Post post=blogService.getPost(like.getPostId()).get();
		User user=userService.getUser(like.getUserId()).get();
		post.addLiker(user);		
		return blogService.addPost(post);	
	}
	
	@PostMapping("/blog/comment")
	Post commentOnPost(@RequestBody Comment comment )
	{
		Post post=blogService.getPost(comment.getPost().getId()).get();
		User user=userService.getUser(comment.getUser().getId()).get();
		return blogService.addComment(post,user,comment);	
	}
}
