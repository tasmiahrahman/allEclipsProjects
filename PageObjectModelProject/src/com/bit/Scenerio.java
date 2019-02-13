package com.bit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scenerio {

	ChromeDriver dr;

	Scenerio(ChromeDriver dr) {

		this.dr = dr;

	}

	Common c;//int a; 

	void target() {

		c = new Common(dr);
		c.myGet("https://www.target.com/");

	}

}
