import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared {
	ChromeDriver dr;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
	}

	public void myGet(String s) {

		dr.get(s);
		// dr.navigate().to("s");
	}

	public void verifyTitle() {

		String v = dr.getTitle();

		System.out.println(v);
	}

	public void closeBrowser() throws InterruptedException {

		Thread.sleep(4000);

		dr.quit();// quit();Quits this driver, closing every associated window.
	}

	public String verifyPageUrl() {// this is return type

		String cul = dr.getCurrentUrl();
		System.out.println(cul);
		return cul;
	}

	public void verifyElementDisplay(By locate) {

		dr.findElement(locate).isDisplayed();

		System.out.println(dr.findElement(locate).isDisplayed());

	}

	public void clickElement(By locator) {// parameterized method to click

		dr.findElement(locator).click();
	}

	public void type(WebElement element, String value) {// parameterized method to write

		element.sendKeys(value);
	}

	public WebElement typeAndClickAnywhere(WebElement ele) {//return type method

		return ele;
	}
}
