package com.instisoft.user.dto;

public class UserDTO {

	private String userid;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String gender;
	private String dob;
	private String email;
	private String phone;
	private String auth_status;
	private String user_status;
	private String role_status;
	
	public String getUserid() {
		return userid;
	}
	
	
//	public void setUserid(String userid) {
//		this.userid = userid;
//	}

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAuth_status() {
		return auth_status;
	}

	public void setAuth_status(String auth_status) {
		this.auth_status = auth_status;
	}

	public String getUser_status() {
		return user_status;
	}

	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}

	public String getRole_status() {
		return role_status;
	}

	public void setRole_status(String role_status) {
		this.role_status = role_status;
	}


	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", gender=" + gender + ", dob=" + dob + ", email=" + email
				+ ", phone=" + phone + ", auth_status=" + auth_status + ", user_status=" + user_status
				+ ", role_status=" + role_status + "]";
	}

		
	
}
