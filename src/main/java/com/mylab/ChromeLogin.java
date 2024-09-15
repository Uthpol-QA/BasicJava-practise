package com.mylab;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLogin {
	public static void main(String[] args) {

//step 1  ==> chromeBrowser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //set window maximize
		driver.get("https://www.demoblaze.com/index.html"); //go to URL

//step 2  ==> add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//Step 3  ==> click login
		driver.findElement(By.xpath("(//*[@class='nav-link'])[5]")).click();

//Step 4  ==> pass user name
		driver.findElement(By.xpath("(//*[@class='form-control'])[6]")).sendKeys("john321sell@proton.me");

//Step 5  ==> pass password				
		driver.findElement(By.xpath("(//*[@class='form-control'])[7]")).sendKeys("1234567");

//Step 6  ==> click sign in
		driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[3]")).click();

	}
}
