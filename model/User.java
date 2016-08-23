package com.niit.back.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
	@Column(unique=true)
	private String username;
     @Email @NotEmpty(message="email cannot be empty")
    private String email;
    @NotEmpty(message="name cannot be empty")
     private String name;
    @NumberFormat @NotEmpty(message="number cannot be empty")
    private int phone;
    
    @Transient
    private MultipartFile img;
    public MultipartFile getImg() {
		return img;
	}
	public void setImg(MultipartFile img) {
		this.img = img;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	private String role;
	@Column(name="enabled")
    private boolean enabled;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUser_name(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@NotEmpty (message="location cannot be empty")
	private String location;
    public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@NotEmpty (message="password cannot be empty")
    private String password;
	
	

}
