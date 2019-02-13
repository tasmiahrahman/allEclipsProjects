import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
WebDriver dr;

public void openBrowser(String browser) {
	
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 dr=new ChromeDriver();
	}
	else if(browser.equals("firefox")) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 dr=new FirefoxDriver();
		
	}

}

public HomePage goToUrl(){
	
	dr.get("https://www.eshopper24.com/");
	
	return new HomePage();
}
}
