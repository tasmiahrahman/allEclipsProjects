import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Nasted {

	ChromeDriver dr;

	@Test
	public void Macys() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.macys.com");
		dr.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		WebElement shopByDepartment = dr.findElement(By.xpath("//div[@id='shopByDepartmentDropdownLabel']"));

		Actions mouse = new Actions(dr);
		mouse.moveToElement(shopByDepartment).perform();
		Thread.sleep(2000);
		WebElement women = dr.findElement(By.xpath("//span[contains(text(),'WOMEN')]"));
		Actions wo = new Actions(dr);
		wo.moveToElement(women).perform();
		Thread.sleep(3000);
		List<WebElement> manu=dr.findElements(By.xpath("//ul[@id='mainNavigationFobs']/li"));//ami copy korse jani na kamnay size nesay
		int manuSize = manu.size();
		System.out.println(manuSize);
		for(int i=0;i<manuSize;i++) {
			
		String s=	manu.get(i).getText();
		System.out.println(s);
//		
		WebElement arrival = dr.findElement(By.xpath(
				"//a[@href='/shop/womens-clothing/new-womens-clothing?id=68514&cm_sp=us_hdr-_-women-_-68514_new-arrivals_COL1']"));
		Actions arrivals=new Actions(dr);
		arrivals.moveToElement(arrival).perform();
		Thread.sleep(4000);
		
		List<WebElement>womenSubManu=dr.findElements(By.xpath(".//*[@id='mainNavigationFlyouts']/div[1]/div[1]/ul/li[4]/a"));
		
		int womenSubManuSize = womenSubManu.size();
		
		System.out.println(womenSubManuSize );
		for(int n=1;n<womenSubManuSize ;n++) {// ami prothom 2ee ta nise
			
			//System.out.println(womenSubManu.get(n).getText());// ami submanu er text kamnay pabo??
			
			
		}
	}
	}
	@Test
	public void handbagClick() {
		
		
	}
	@After
	public void close() {
		dr.quit();

	}
}
