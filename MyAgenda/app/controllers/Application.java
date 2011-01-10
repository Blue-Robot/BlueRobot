package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Task;
import play.mvc.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void showTasks() {
    	List<Task> tasks = Task.findAll();
    	render(tasks);
    }
}
