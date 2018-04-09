package com.thereimlearningjava.login;

public class LoginService {
	public boolean isUserValid(String user, String password) {
		if ((user.toLowerCase().equals("alex")) & (password.equals("1234"))) return true;
		
		return false;
	}
}
