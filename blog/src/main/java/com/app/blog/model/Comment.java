package com.app.blog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.Data;

@Data
@Entity
public class Comment {

	@Id
	Long id;
	@ManyToOne
	User user;
	String text;
}
