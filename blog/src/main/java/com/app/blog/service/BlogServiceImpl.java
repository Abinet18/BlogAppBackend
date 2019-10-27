package com.app.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.blog.model.Comment;
import com.app.blog.model.Post;
import com.app.blog.model.User;
import com.app.blog.repository.BlogRepository;
import com.app.blog.repository.CommentRepository;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	BlogRepository br;
	
	@Autowired
	CommentRepository commentRepo;

	@Override
	public List<Post> getAllPosts() {
			return (List<Post>)br.findAll();
	}

	@Override
	public Post addPost(Post post) {
		return br.save(post);
	}

	@Override
	public Post LikePost(Post post, User user) {
		//post.getLikers();
		post.addLiker(user);
		return br.save(post);
	}

	@Override
	public Post addComment(Post post, User user, String text) {
		Comment comment=new Comment();
		comment.setUser(user);
		comment.setText(text);
		post.addComment(comment);
		commentRepo.save(comment);
		return br.save(post);
	}

	@Override
	public Optional<Post> getPost(Long id) {
		return br.findById(id);
	}

}
