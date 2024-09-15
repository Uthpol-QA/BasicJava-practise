package com.mylab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DrugNDropAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Navigate to the webpage containing the source and destination elements
		driver.get("https://example.com");

		// Locate the source and destination elements
		WebElement sourceElement = driver.findElement(By.id("sourceElementId"));
		WebElement destinationElement = driver.findElement(By.id("destinationElementId"));

		// Create an instance of Actions class
		Actions actions = new Actions(driver);

		// Perform drag and drop action from source to destination element
		actions.dragAndDrop(sourceElement, destinationElement).build().perform();

		// Close the browser
		driver.quit();
	}
}
