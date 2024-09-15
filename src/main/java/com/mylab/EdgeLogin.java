package com.mylab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeLogin {

	void login() {
		// open edge browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");

	}

	public static void main(String[] args) {
		EdgeLogin obj = new EdgeLogin();
		obj.login();

	}

}
