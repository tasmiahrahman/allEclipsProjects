import org.openqa.selenium.By;

public class Practice {
	Shared kr = new Shared();

	public void signUp1() throws InterruptedException {
		kr.openBrowser();
		kr.myGet("https://www.facebook.com/");
		boolean o = kr.verifyPageTitle("or");
		System.out.println(o);
		
		kr.getAttribueValue(By.id("u_0_c"), "aria-label");
		boolean q = kr.verifyPageUrl("https://www.facebook.com/");
		System.out.println(q);
		// or
		// System.out.println(kr.verifyPageUrl("kr.verifyPageUrl(\"https://www.facebook.com/");"));
		kr.GetElementById("u_0_c").sendKeys("hjk.h");
		// kr.getElement(By.id("")).sendKeys("fjfg");// x-path,css,id,tag
		kr.getElement(kr.getDriver().findElement(By.id("u_0_c"))).sendKeys("idhli");

		kr.close();

	}
}
