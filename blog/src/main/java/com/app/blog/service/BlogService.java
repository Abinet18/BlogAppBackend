package com.app.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.blog.model.Comment;
import com.app.blog.model.Post;
import com.app.blog.model.User;

@Service
public interface BlogService {
	
	List<Post> getAllPosts();
	Post addPost(Post post);
	Post LikePost(Post post,User user);
	Post addComment(Post post,User user,Comment comment);
	Optional<Post> getPost(Long id);
}
