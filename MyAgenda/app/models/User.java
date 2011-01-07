package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;



@Entity
public class User extends Model {
	public String nickname;
	public String password;
	public String email;
	
	public User (String nickname, String password, String email) {
		this.nickname = nickname;
		this.password = password;
		this.email = email;
	}
}
