package homePrivate.com;

import org.junit.Test;

public class Execute extends Base {

	@Test
	public void testSignUp() {
		SignUpResources x= new SignUpResources();
		x.setfName("hibijibi");
		x.setlName("bklb");
		x.setMobile("1234");
		x.setnPass("hilhu");
		
		SignUp z = new SignUp(dr);
		z.signUp(x.getfName(),x.getlName());
		
		
		
		
	}
	
}
