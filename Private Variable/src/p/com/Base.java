package p.com;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	ChromeDriver dr;
	@Before
	public void Start() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.facebook.com/");
		
		
		
	}
	
	@After
	public void close() {
		
		dr.quit();
		
	}
	
}
