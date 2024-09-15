package com.mylab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLogin2 {

	public static void main(String[] args) {

		// step 1
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// step 2
		driver.get("http://automationpractice.com/index.php");
		// Step 3 ==> user name
		driver.findElement(By.className("login")).click();// click sign in btn
		driver.findElement(By.id("email")).click();// click email
		driver.findElement(By.id("email")).sendKeys("sarowerny@gmail.com");// write my email
		// step 4==> password
		driver.findElement(By.name("passwd")).click();
		driver.findElement(By.name("passwd")).sendKeys("student");
		// step 5>> click sign in
		driver.findElement(By.name("SubmitLogin")).click();

	}
}
