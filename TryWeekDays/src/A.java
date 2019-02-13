import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");downlode thakay unziped folder tar path shift right key deya path copy kortay hobay.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.jcpenney.com/");
		dr.manage().window().maximize();
		String s=dr.getTitle();
		System.out.println(s);
		
		dr.findElement(By.id("shopDepartmentBtn")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("test-automation-btn-0")).click();// not working
		Thread.sleep(3000);
		dr.close();
		
	}
}
