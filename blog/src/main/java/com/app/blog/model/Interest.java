package com.app.blog.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Interest {
	@Id
	int id;
	String word;	
}
