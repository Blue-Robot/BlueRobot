package controllers;

import models.Task;
import play.mvc.*;

@With(Secure.class)
public class UserController extends Controller{
	public static void showUserPage() {
		render();
	}
}
