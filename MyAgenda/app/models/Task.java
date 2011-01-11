package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class Task extends Model{
	public String name;
	
	@ManyToOne
	public Table table;
	
	public Task(String name, Table table) {
		this.name = name;
		this.table = table;
	}
}
