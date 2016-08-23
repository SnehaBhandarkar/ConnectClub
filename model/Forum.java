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
public class Forum {
	
	@NotEmpty(message="forum title cannot be empty")
	private String forumTitle;
	@NotEmpty(message="forum content cannot be empty")
	private String forumContent;
	@NotEmpty(message="username cannot be empty")
	@Column(unique=true)
	private String username;
	@NotEmpty(message="creation date cannot be empty")
	private Date creationDate;	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int forumId;

	public String getForumTitle() {
		return forumTitle;
	}

	public void setForumTitle(String forumTitle) {
		this.forumTitle = forumTitle;
	}

	public String getForumContent() {
		return forumContent;
	}

	public void setForumContent(String forumContent) {
		this.forumContent = forumContent;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getForumId() {
		return forumId;
	}

	public void setForumId(int forumId) {
		this.forumId = forumId;
	}
	
}
