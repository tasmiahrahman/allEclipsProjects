package p.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	ChromeDriver dr;

	LogIn(ChromeDriver x) {
		dr = x;

	}

	public void logIn(String userId, String pass) {

		dr.findElement(By.id("email")).sendKeys("userId");//from facebook
		dr.findElement(By.id("pass")).sendKeys("pass");

	}

}
