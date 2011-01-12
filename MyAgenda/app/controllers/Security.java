package controllers;

import models.User;

public class Security extends Secure.Security {

	static boolean authenticate(String username, String password) {
		System.out.println(username);
		User user = User.find("byName",username).first();
		return user != null && user.password.equals(password);
	}

	static void onDisconnected() {
		Application.index();
	}
}