package com.app.blog.model;

public class PostInput {
	
	Long userid;
    String title;
    String content;
    int[] interests;
    String imageUrl;
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int[] getInterests() {
		return interests;
	}
	public void setInterests(int[] interests) {
		this.interests = interests;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
    
}
