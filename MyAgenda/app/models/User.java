package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;

@Entity
public class User extends Model{
	public String name;
	public String password;
	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
}
