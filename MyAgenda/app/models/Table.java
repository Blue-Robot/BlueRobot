package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;

@Entity
public class Table extends Model{
	public String name;
	
	@OneToMany(mappedBy="table", cascade=CascadeType.ALL)
	public List<Task> tasks;
	
	public Table(String name) {
		this.name = name;
		this.tasks = new ArrayList<Task>();
	}
}