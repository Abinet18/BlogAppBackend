package com.app.blog.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Post {
	@Id
	Long id;
	String title;
	@ManyToMany
	List<Interest> interests;
	String content;
	String imageUrl;
	@ManyToMany
	List<User> likers;
	@OneToMany
	List<Comment> comments;
}
