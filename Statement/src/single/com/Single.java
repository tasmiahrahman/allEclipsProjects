package single.com;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single {
	/*
	 * 1. Single statement: If else (else never take any parameter) If the condition
	 * is true the compiler will go inside the building block if the condition is
	 * not true then compiler will go to else statement and Execute what's inside
	 * else statement
	 */

	ChromeDriver dr;

	@Before
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();

	}

	@Test
	public void target() {

		dr.get("https://www.target.com");
		boolean b = dr.getTitle().contains("target");// not true
		if (b) {

			System.out.println("target found");
		} else {

			System.out.println(" if statement is false,else printed :target not found");
		}
	}

	@Test
	public void facebook() {
		dr.get("https://www.facebook.com/");

		dr.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		if (dr.getPageSource().contains("facebook")) {
			System.out.println("facebook");
		} else {
			System.out.println("facebook not found");

		}
	}
	/*
	 * public void get() {//void can't be boolean condition
	 * 
	 * 
	 * if(dr.get("https://www.bluefly.com")) {
	 * 
	 * 
	 * } }
	 */

	@After
	public void close() {
		dr.quit();

	}
}
