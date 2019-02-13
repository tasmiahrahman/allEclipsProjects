package shadidul.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TypePractice {

	ChromeDriver dr;

	public void start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		//Thread.sleep(2000); //next kaj hobar agay 2 sec wait koro 2ee request er majay. Thread java building class.
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public TypePractice(ChromeDriver dr) {// right click==>source==>generate constructor.
		super();// parent class
		this.dr = dr;// current class
	}

	public ChromeDriver getDr() {//getter
		return dr;
	}

	public void setDr(ChromeDriver dr) {//setter
		this.dr = dr;
	}
}
