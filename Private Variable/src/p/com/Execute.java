package p.com;

import org.junit.Test;

public class Execute extends Base {
	@Test
	public void testLogIn() {
		LogInResources y = new LogInResources();

		y.setuserId("ghkg");
		y.setPass("1hidul2345");

		LogIn v = new LogIn(dr);

		//v.logIn(y.getPass(), y.getPass());
v.logIn(y.getuserId(), y.getPass());
	}

}
