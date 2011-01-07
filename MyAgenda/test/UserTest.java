import models.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import play.test.UnitTest;


public class UserTest extends UnitTest{
	
	@Test
	public void shouldCreateUser() {
		String nickname = "nick";
		String password = "1234";
		String email = "user@mail.org";
		User user = new User(nickname, password, email);
		assertEquals(nickname, user.nickname);
		assertEquals(password, user.password);
		assertEquals(email, user.email);
	}
}
