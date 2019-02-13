import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HeadlessUnitBrowser {

	WebDriver dr;
	
	
	@Test
	public void m1() throws IOException {
		
		WebDriver dr = new HtmlUnitDriver();//headlessunit browser
		dr.get("https://www.fullbeauty.com/");
		dr.switchTo().defaultContent();//will take to home page. if multipal browser user then we need to go back home pafe selenium does't know
		Select drop=new Select(dr.findElement(By.id("")));
		//drop.se 3ta show korbay 
		
	}
@Test
public void create_txtfile() throws IOException {
	
	File file= new File("C:\\Users\\tasmiah\\Desktop\\tas.txt");// creat txt file
	file.createNewFile();
	
}
@Test
public void createAllKindOffile() throws IOException {
	
	File file= new File("C:\\Users\\tasmiah\\Desktop\\tas.docs");// creat docs file//just change extention so i can open different different file
	file.createNewFile();
	
}
@Test
public void createfileAndWrite() throws IOException {
	
	File file= new File("C:\\Users\\tasmiah\\Desktop\\tas.docs");// 
	
	file.createNewFile();
	
	/*FileOutputStream fos = new FileOutputStream(file);//how to write
	OutputStreamWriter ous=new OutputStreamWriter(fos);
	BufferedWriter bfw = new BufferedWriter(ous);
	Writer w= new BufferedWriter(bfw);*/
	Writer w1=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file) ));//this way i will write
	w1.write("my name is tasmiah");
	
	
}


}
