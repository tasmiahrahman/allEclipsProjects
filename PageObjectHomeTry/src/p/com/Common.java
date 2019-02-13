package p.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {// Concept of page object model,method overload And method override.

	ChromeDriver dr;

	Common(ChromeDriver dr) {// Constructor of Common class.
		this.dr = dr;
	}

	// concept of method overload.Multipal method same name .parameter size , type
	// and sequence
	// are different.
	public void myGet(String url) throws InterruptedException {
		dr.get(url);

		Thread.sleep(1000);

	}

	public void myGet() {
		dr.get("https://www.target.com/");

	}

	public void click() {// regular method

		dr.findElement(By.id("account")).click();// signin
	}

	public void click(String idValue) {// parameter

		dr.findElement(By.id("idValue")).click();
	}

	public void click(By locator) {

		dr.findElement(locator).click();
	}

	public void click(WebElement element) {

		element.click();

	}

	public WebElement clickAndType(WebElement ele) {// return type

		return ele;
	}

	public void type() {

		dr.findElement(By.id("username")).sendKeys("tarcheck");

	}

	public void type(String id, String t) {

		dr.findElement(By.id(id)).sendKeys(t);// you can use x-path,css selector and other locators.

	}

	public void type(By by, String tr) {//method overload

		dr.findElement(by).sendKeys(tr);

	}

	public void type(WebElement type, String st) {//method overload

		type.sendKeys(st);

	}

	public void verifyTitle() {//method overload

		String s = dr.getTitle();
		System.out.println(s);
	}
//question: if i change method type that will also included to a method overload???!!
	public boolean verifyTitle(String Title) {//method overload
		String st = dr.getTitle();
		boolean b = st.contains(Title);

		return b;
	}

	public boolean verifyPageUrl(String url) {
		
		String sv=dr.getCurrentUrl();
		boolean b1=sv.contains(url);
		return b1;
	}

	public List<WebElement> getElements(By by){
		
		List<WebElement> l=	dr.findElements(by);
		
		return l;
	}

	

	public String getAttribueValue(By by, String attributeName) {

		String h = dr.findElement(by).getAttribute(attributeName);

		return h;
	}

	public boolean verifyTextFromPage(String textContains) { // html

		boolean k = dr.getPageSource().contains(textContains);

		return k;
	}

	public boolean verifyElementDisplay(By by) {

		boolean j = dr.findElement(by).isDisplayed();
		return j;
	}

}
