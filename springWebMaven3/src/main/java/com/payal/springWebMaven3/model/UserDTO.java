package com.payal.springWebMaven3.model;

public class UserDTO {
	private String username;
	private String password;
	private int age;
	private String address;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", password=" + password + ", age=" + age + ", address=" + address
				+ "]";
	}
	
	
}
