package com.mylab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public void login() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://google.com/");
//		driver.get("http://automationpractice.com/");

	}

	public static void main(String[] args) {
		Browser obj = new Browser();
		obj.login();
	}

}
