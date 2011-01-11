package Jobs;

import models.*;

import play.Play;
import play.jobs.Job;
import play.jobs.OnApplicationStart;


@OnApplicationStart
public class BootStrap extends Job {
	public void doJob() {
		Table toDo = new Table("ToDo").save();
		new Task("Brush your teeth", toDo).save();
		new Task("Get groceries", toDo).save();
		new Task("Visit your grandma", toDo).save();
	}
}
