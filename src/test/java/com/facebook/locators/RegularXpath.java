package com.facebook.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegularXpath {
	WebDriver driver;
	
	@BeforeTest
	public void ChromeBrowser () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nil");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@name='pass']"));
		passWord.clear();
		passWord.sendKeys("khan");
		System.out.println(passWord.getTagName());
		driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		
		
	}
	

}
