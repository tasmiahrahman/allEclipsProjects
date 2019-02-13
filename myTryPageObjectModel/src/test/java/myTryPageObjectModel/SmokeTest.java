package myTryPageObjectModel;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest extends Base{
 
	

	
/*An internal error occurred during: "Initializing Java Tooling".
	java.lang.NullPointerException*/
	
	Home hp;
	WomenPage wp;
	
	@Test
	public void test() {
		
	
		hp=new Home(dr);
		hp.verifyTitle();
	wp=	(WomenPage) hp.clickWomenLink().get();//.get() ta paese karon holo women page ta lodable component implement korsey
		
	}
}
