package overload.Practrice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	ChromeDriver dr;

	public void m1() {//this is blank

	}

	public void m1(int a) {// 1 parameter,size 1

	}

	public void m1(int a,String s) {//2 parameter,size 2

	}

	public void m1(String s,int a) {//2 parameter,sequence different

	}

	

}
