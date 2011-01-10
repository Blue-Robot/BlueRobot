package Jobs;

import models.*;

import play.Play;
import play.jobs.Job;
import play.jobs.OnApplicationStart;


@OnApplicationStart
public class BootStrap extends Job {
	public void doJob() {
		new Task("Brush your teeth").save();
		new Task("Get groceries").save();
		new Task("Visit your grandma").save();
	}
}
