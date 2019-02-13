package com.bit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	static ChromeDriver dr;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
	}
	public static void closeBrowser() throws InterruptedException {

		Thread.sleep(4000);

		dr.quit();// quit();Quits this driver, closing every associated window.
	}
}
