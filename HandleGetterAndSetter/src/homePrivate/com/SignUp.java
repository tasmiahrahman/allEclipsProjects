package homePrivate.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
 ChromeDriver dr;
 //signUp class' constructor.
 SignUp(ChromeDriver dr){
	 
	 this.dr=dr;
	 
 }

 public void signUp(String string, String string2) {
	dr.findElement(By.id("u_0_c")).sendKeys("nbhj"); 
	dr.findElement(By.id("u_0_e")).sendKeys("nknkln");
	
	dr.findElement(By.id("u_0_h")).sendKeys("1234567");
	dr.findElement(By.id("u_0_o")).sendKeys("nPass");
	new Select(dr.findElement(By.id("month"))).selectByVisibleText("Jun");
	 
	 
 }


}
