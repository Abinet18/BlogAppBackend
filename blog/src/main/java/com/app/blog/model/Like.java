package com.app.blog.model;

public class Like {

	Long userId;
	Long postId;
	
	public Like() {
		
	}
	public Like(Long userId, Long postId) {
		super();
		this.userId = userId;
		this.postId = postId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	
	
}
