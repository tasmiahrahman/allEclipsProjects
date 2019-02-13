package my.extendreport;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base {

	
	ChromeDriver dr;

	@BeforeTest
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.ugg.com/");
		dr.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		dr.navigate().refresh();
}
}