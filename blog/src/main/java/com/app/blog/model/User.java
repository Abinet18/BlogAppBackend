package com.app.blog.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	Long id;
	@Column(unique=true)
	String username;
	String firstname;
	String lastname;
	String password;
	@ManyToMany
	List<Interest> interests;
}
