package com.niit.back.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Blog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int blogid;
	@NotEmpty(message="blog title cannot be empty")
	private String blogTitle;
	@NotEmpty(message="blog content cannot be empty")
	private String blogContent;
	@NotEmpty(message="username cannot be empty")
	@Column(unique=true)
	private String username;
	@NotEmpty(message="date of creation cannot be empty")
	private Date creationDate;
	public int getBlogid() {
		return blogid;
	}
	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogContent() {
		return blogContent;
	}
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	

}
