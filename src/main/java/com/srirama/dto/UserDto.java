package com.srirama.dto;

public class UserDto {

	private String firstName;
	
	private String emailId;
	
	private String password;
	

	public UserDto() {
		
	}

	public UserDto(String firstName, String emailId, String password) {
		this.firstName = firstName;
		this.emailId = emailId;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
