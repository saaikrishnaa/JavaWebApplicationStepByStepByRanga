package com.in28minutes.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("in28Minutes") && password.equals("dummy"))
			return true;

		return true;
	}

	public boolean isUserValid(String user, String password, String another) {
		if (user.equals("in28Minutes") && password.equals("dummy"))
			return true;

		return true;
	}

}
