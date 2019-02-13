import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared {

	ChromeDriver dr;
	int a = 10;
	String s = "fool";

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
	}

	public void close() {// close(); void so return type hobay na.

		dr.close();
	}

	public void myGet(String url) {// my get()is void type. return type is not is not accepted

		dr.get(url);

	}

	public boolean verifyPageTitle(String titleValue) {//

		String s = dr.getTitle();
		boolean b = s.contains("titleValue");// contains when we work with part os text or value
		// boolean v=dr.getTitle().contains("titleValue");//same thing
		return b;
	}

	public boolean verifyPageUrl(String expectedUrl) {

		String url = dr.getCurrentUrl();
		boolean g = url.equals(expectedUrl);// equals()campare two 2 string and return value
		return g;

	}

	public WebElement GetElementById(String value) {

		WebElement e = dr.findElement(By.id("value"));

		return e;
	}
//homeWork Create method for id,name,x-path,css-selector,attribute

	public WebElement getElement(By by) {

		dr.findElement(by);

		return dr.findElement(by);
	}

	public WebElement getElement(WebElement e) {

		return e;
	}

	public boolean verifyText(By by, String expectedText) {

		String d = dr.findElement(by).getText();// last method er returen type ja hobay.for Example getText() String .// variable declare korlay String hobay 
		boolean f = d.contains(expectedText); 
		return f;
	}

	public List<WebElement> getElements(By by) {

		List<WebElement> l = dr.findElements(by);
		return l;
	}

	public WebDriver getDriver() { //WebDriver dr=new FirefoxDriver(); or WebDriver dr= new ChromeDriver();

		return dr;//
	}

	public String getAttribueValue(By by, String attributeName) {

		String h = dr.findElement(by).getAttribute("attributeName");

		return h;
	}

	public boolean verifyTextFromPage(String textContains) { // html

		boolean k = dr.getPageSource().contains("textContains");

		return k;
	}

	public boolean verifyElementDisplay(By by) {

		boolean j = dr.findElement(by).isDisplayed();
		return j;
	}

}
