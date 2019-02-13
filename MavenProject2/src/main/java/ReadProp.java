import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadProp {

	WebDriver dr;
//read from property file
	 @Test
	public void m1() throws IOException, InterruptedException {

		Properties prop = new Properties();
		FileInputStream sp = new FileInputStream(
				"C:\\Users\\tasmiah\\eclipse-workspace\\MavenProject2\\src\\main\\java\\config.properties ");
		prop.load(sp);
		System.out.println(prop.getProperty("browser"));//chrome will print because file has key value browser=chrome

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) /*/in future key value change in the file, i don't need to change anything bacoz of condition 
			it will check condition and go browser=c/f/s either one*/
		
		
		{	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver dr = new ChromeDriver();
			dr.manage().window().maximize();
			
			 dr.get(prop.getProperty("url"));// property file has url=macys.com
			 dr.findElement(By.xpath(prop.getProperty("ShopByDepartmentX-path"))).click();//ShopByDepartmentX-path=//span[@id='shopByDepartmentLabelText']
			 Thread.sleep(2000);
			 dr.findElement(By.xpath(prop.getProperty("men"))).click();//men=.//*[@id='flexid_1']/a/span
//homeWork:i don't know how to use logic here.
		} else if (browserName.equals("FirefoxDriver")) {
			dr = new FirefoxDriver();

		} else if (browserName.equals("safari")) {

			dr = new SafariDriver();
		}
		
		else if(browserName.equals("ie")) {
			
			dr=new InternetExplorerDriver();
		}
		
		else {

			System.out.println("No Browser");
		}
	
	 
	
	 }
	 
	 

}


