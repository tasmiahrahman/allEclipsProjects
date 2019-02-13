package myTryPageObjectModel;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	ChromeDriver dr;

	@Test
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.ugg.com/");
		dr.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		dr.navigate().refresh();

	}
	

	@After
	public void Close() throws InterruptedException {

		Thread.sleep(2000);
		dr.quit();
	}
}
