package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class Task extends Model{
	public String name;
	
	public Task(String name) {
		this.name = name;
	}
}
