package com.class28;

public class Registration {
	private String email, userName, password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.contains("gmail")) {
			if (email.contains("@")) {

				this.email = email;
			} else {
				System.out.println("Email should contain @");
			}
		} else {
			System.out.println("Email should contain gmail");
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
			if (userName.length() > 6) {

				this.userName = userName;
			} else {
				System.out.println("Username can not contain password.");
			}
		} else {
			System.out.println("Username should be longer than 6 characters");
		}

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (!password.contains(userName)) {

					this.password = password;
				} else {
					System.out.println("Password can not contain username.");
				}
			} else {
				System.out.println("Password should be longer than 6 characters.");
			}
		} else {
			System.out.println("Password can not be empty");
		}
	}

}