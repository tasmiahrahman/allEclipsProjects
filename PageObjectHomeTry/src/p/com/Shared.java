package p.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared {
	ChromeDriver dr;

	Shared(ChromeDriver dr) {
		this.dr = dr;
	}

Common c;
public void target() throws InterruptedException {
	
	c=new Common(dr);
	//c.myGet(); //without parameter which is working
	c.myGet("https://www.target.com/");
	c.verifyTitle();
	c.clickAndType(dr.findElement(By.id("account"))).click();
	Thread.sleep(2000);
	c.click(dr.findElement(By.xpath("//li[@id='accountNav-createAccount']/a/div")));
	c.type();
	c.clickAndType(dr.findElement(By.id("firstname"))).sendKeys("tarcheck");
	
	
}








}
