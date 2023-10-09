package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleXpatht {
WebDriver driver;
	
	@BeforeTest
	public void openFacebook() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void doublexPathTest () {
		driver.findElement(By.xpath("//input[@id='email'][@name='email']")).sendKeys("nilima islam");
		
	}
	@Test
	public void orCondition() {
		driver.findElement(By.xpath("//input[@name='pass' or @id='pass']")).sendKeys("nilima123");
	}
	
	@Test
	public void andCondition() {
		driver.findElement(By.xpath("//button[@name='login' and @class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
	}

}
