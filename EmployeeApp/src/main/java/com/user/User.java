package com.user;

public class User {
	
	private Long userId;
	private String username;
	private String password;
	private String fname;
	private String lname;
	private String email;
	private Long phno;
	private String address;
	private String isAdmin;
	public User() {
		super();
	}
	public User(Long userId, String username, String password, String fname, String lname, String email, Long phno,
			String address, String isAdmin) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phno = phno;
		this.address = address;
		this.isAdmin = isAdmin;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", fname=" + fname
				+ ", lname=" + lname + ", email=" + email + ", phno=" + phno + ", address=" + address + ", isAdmin="
				+ isAdmin + "]";
	}
	
	
	
	
}
