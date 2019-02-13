package homePrivate.com;

import org.junit.After;
import org.junit.Before;
import org.junit.rules.Timeout;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	ChromeDriver dr;

	@Before
	public void start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
	}
	
	@After
	public void close() {

		dr.quit();
	}

}
