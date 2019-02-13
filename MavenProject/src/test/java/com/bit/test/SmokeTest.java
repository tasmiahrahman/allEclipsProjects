package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {
	WebDriver dr;
	@Test
	public void test() {
		System.out.println("This is a maven project.");
		
		}

@Test
public void jcPenny() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
	dr=new ChromeDriver ();
	dr.manage().window().maximize();
	dr.get("http://www.jcpenny.com");
	dr.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	dr.findElement(By.xpath("//a[contains(text(),'Toys')]")).click();
	dr.findElement(By.xpath("//a[contains(text(),'Avengers')]")).click();
	dr.findElement(By.xpath("//div[@id='gallery-ppr5007502878']//span[@class='btnText'][contains(text(),'Add To Cart')]")).click();
	dr.findElement(By.xpath("//span[@class='_3m-pR']")).click();
	Thread.sleep(2000);
	//dr.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]")).click();//chrome driver nelay kaj korey na
	dr.findElement(By.xpath(".//*[@id='atPanelContent']/div/div/div/section/section/section[1]/div[3]/div/button[2]")).click();//mozila working
	//dr.findElement(By.xpath("//div[@id='gallery-ppr5007794291']//span[@class='btnText'][contains(text(),'Add To Cart')]")).click();
	Thread.sleep(2000);
	dr.findElement(By.xpath(".//*[@id='gallery-ppr5007794291']/button")).click();
	Thread.sleep(2000);
	dr.findElement(By.xpath("//span[@class='_3m-pR']")).click();
	Thread.sleep(2000);
	dr.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]")).click();
	Thread.sleep(2000);
	
	dr.findElement(By.xpath(".//*[@id='gallery-ppr5007502869']/button")).click();
	Thread.sleep(4000);
	dr.findElement(By.xpath(".//*[@id='atPanelContent']/div/section/div/section[2]/div[2]/div/div/button")).click();
	Thread.sleep(4000);
	dr.findElement(By.xpath(".//*[@id='atPanelContent']/div/div/div/section/section/section[1]/div[3]/div/button[1]")).click();
	Thread.sleep(4000);
	String total=dr.findElement(By.xpath("//div[@class='sticky-inner-wrapper']//div[@class='_1iGCw orderInfoBlock _2SR85']")).getText();
	System.out.println(total);
	dr.findElement(By.xpath("//ul[@class='_4RX7q']//li[1]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[4]//div[1]//div[2]//div[1]//button[1]")).click();
	dr.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
	Thread.sleep(3000);
	String afterRemoveTotal=dr.findElement(By.xpath(".//*[@id='content']/main/article/section[1]/section/span/div/div[2]/div/div/div/div[2]/section/div[1]/span/div[2]/div[1]/div[2]/strong")).getText();
	
	System.out.println("afterRemoveTotal should be :$379.98 "+ afterRemoveTotal);// if else add koro.
	//dr.quit();
	
}



































}
