package com.bit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest extends BaseTest{
	
	
	static ChromeDriver dr;// dr came form BaseTest because SmokeTest inherited 
	public static void main(String[]args) throws InterruptedException {
		openBrowser();
		
	
		
		Scenerio p= new Scenerio(dr);
		p.target();
		closeBrowser();
	}
}
