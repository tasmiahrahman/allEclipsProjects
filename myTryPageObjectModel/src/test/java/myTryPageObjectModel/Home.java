package myTryPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	ChromeDriver dr;

	@FindBy(xpath="\".//*[@id='navigation']/nav/ul/li[1]/a\"")WebElement womenlink;
	public Home(ChromeDriver kr) //constructor of this Home Page
	{
		dr = kr;
		PageFactory.initElements(dr, this);
	}

	void verifyTitle() {

		String title = dr.getTitle();
		System.out.println(title);
	}
/*public WomenPage clickWomenLink() {
	
	dr.findElement(By.xpath(".//*[@id='navigation']/nav/ul/li[1]/a")).click();//if i don't use pageFactory then
	return new WomenPage(dr);
}*/
	
	public WomenPage clickWomenLink() {
		
		womenlink.click();// womenlink ta 
		return new WomenPage(dr);
	
	
	}	
}
