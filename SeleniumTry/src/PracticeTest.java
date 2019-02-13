import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class PracticeTest {
	Shared kr = new Shared();

	public void signUp1() throws InterruptedException {
		kr.openBrowser();
		kr.myGet("https://www.facebook.com/");// facebook signup
		kr.verifyTitle();
		kr.verifyPageUrl();
		kr.type(kr.dr.findElement(By.id("u_0_c")), "jbekrh");
	
		kr.closeBrowser();

	}

	public void TargetSignUp2() throws InterruptedException {
		kr.openBrowser();
		kr.myGet("https://www.target.com/");//target signup
		kr.verifyTitle();
		kr.verifyPageUrl();
		kr.clickElement(By.id("account"));
		//kr.clickElement(By.id("accountNav-signIn"));not clicking creat account
		//kr.clickElement(By.xpath("//li[@id='accountNav-createAccount']/a[1]"));//i have to learn x-path
		//kr.clickElement(By.xpath("//li[@id='accountNav-signIn']/a/div[1]"));
		kr.closeBrowser();
		

	}

	public void signUp3() throws InterruptedException {
		kr.openBrowser();
		kr.myGet("https://www.fullbeauty.com/");// dr.navigate().to("");
		kr.verifyTitle();
		kr.verifyPageUrl();
		kr.dr.navigate().refresh();// this will stop popup
		kr.dr.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		kr.closeBrowser();

	}
}
