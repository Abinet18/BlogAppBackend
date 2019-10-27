package com.app.blog.mutation;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.blog.model.CommentInput;
import com.app.blog.model.Interest;
import com.app.blog.model.Like;
import com.app.blog.model.Post;
import com.app.blog.model.PostInput;
import com.app.blog.model.User;
import com.app.blog.model.UserInput;
import com.app.blog.service.BlogService;
import com.app.blog.service.InterestService;
import com.app.blog.service.UserService;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class Mutation implements GraphQLMutationResolver{
	
	@Autowired
	private BlogService blogService;
	@Autowired
	private UserService userService;
	@Autowired
	private InterestService interestService;
	
	public Interest addInterest(String word) {
		Interest interest=new Interest();
		interest.setWord(word);
		return interestService.addInterest(interest);
	}
	
	public User addUser(UserInput userInput) {
		User user=new User();
		user.setFirstname(userInput.getFirstName());
		user.setLastname(userInput.getLastName());
		user.setUsername(userInput.getUsername());
		List<Interest> interests=new ArrayList<>();
		for(int id:userInput.getInterests()) {
			Interest interest=interestService.getInterest(id).get();
			interests.add(interest);
		}
		user.setInterests(interests);
		user.setPassword(userInput.getPassword());
		return userService.addUser(user);
	}
	
	public Post addPost(PostInput postInput) {
		Post post=new Post();
		User user=userService.getUser(postInput.getUserid()).get();
		post.setUser(user);
		post.setTitle(postInput.getTitle());
		post.setContent(postInput.getContent());
		List<Interest> interests=new ArrayList<>();
		for(int id:postInput.getInterests()) {
			Interest interest=interestService.getInterest(id).get();
			interests.add(interest);
		}
		post.setInterests(interests);
		post.setImageUrl(postInput.getImageUrl());
		return blogService.addPost(post);
	}
	
	public Post likePost(Like likeInput) {
		
		User user=userService.getUser(likeInput.getUserId()).get();
		Post post = blogService.getPost(likeInput.getPostId()).get();
		return blogService.LikePost(post, user);
	}
	
	public Post commentOnPost(CommentInput commentInput) {
		
		User user=userService.getUser(commentInput.getUserid()).get();
		Post post = blogService.getPost(commentInput.getPostid()).get();
		return blogService.addComment(post, user, commentInput.getText());
	}
	

}
