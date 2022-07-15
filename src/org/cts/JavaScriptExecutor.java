package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

public static void main(String[] args) {
	System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Srimathi K\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
     

	
	WebElement userName = driver.findElement(By.id("email"));
	
	
	
}	
}