package walmartHomeWorkTry;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//parameterized method koro,follow pom,explicite wait use 
public class BaseTest {
	ChromeDriver dr;

	@Test
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();

		dr.get("https://www.walmart.com/");
		dr.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		// scroll down kortay hobay java script executer use kortay hobay
		/*
		 * WebElement ele = dr.findElement(By.xpath("html/body/div[1]/div/div/div/footer/div/section/div/a[3]/img")); 
		 * Coordinates co = ((Locatable) ele).getCoordinates(); co.inViewPort();
		 */
		dr.findElement(By.xpath("html/body/div[1]/div/div/div/footer/div/section/div/a[3]/img")).click();// it is
																											// working
		dr.navigate().refresh();
		String s = dr.getTitle();
		System.out.println(s);
		// verify title if /else deya .contain deya printout koro
		Actions action = new Actions(dr);
		WebElement we = dr.findElement(By.xpath(".//*[@id='layout-wrapper']/div[2]/header/div[2]/div/button[1]"));
		action.moveToElement(we).build().perform();
		// dr.findElement(By.xpath(".//*[@id='layout-wrapper']/div[2]/header/div[2]/div/div/div[1]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[1]/div[2]/header[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]"))
				.click();
		dr.findElement(By.xpath(".//*[@id='main-content']/div/div[1]/div/div[2]/button[1]")).click();
		// boolean condotion ki deya kivhabay korbo??
		WebElement element = dr
				.findElement(By.xpath(".//*[@id='id-new-casual-shirts_all-new']/div/a/div[1]/div/div/img"));
		if (element.isDisplayed() && element.isEnabled()) {
			//element.click();

			// someone explain to me. qus is: verify that any product is not clickable
			System.out.println("all of this are clickable");

		}
		dr.findElement(By.xpath(".//*[@id='search-input']")).click();
		Thread.sleep(5000);
		dr.findElement(By.id("search-input")).sendKeys("coat");
		dr.findElement(By.id("search-input")).click();
		//use pom& use loadableComponent beacuse it is taking me to another page
		//all cote size:.//*[@id='main-content']/div/div[2]/div/a/div[1]/div/div/img 
	List<WebElement> coats=	dr.findElements(By.xpath(".//*[@id='main-content']/div/div[2]/div/a/div[1]/div/div/img"));
	int allCoatsSize=coats.size();
	System.out.println(allCoatsSize);
	/*for(int i=0;i<1;i++) {
		
		String print=coats.get(i).getText();
		System.out.println(print);
	}*/
		dr.quit();
	}
}
