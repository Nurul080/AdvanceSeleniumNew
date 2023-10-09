package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectLocators {
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
	public void idLocatorsTest() {
		driver.findElement(By.id("email")).sendKeys("nilima islam");
		
	}
	
	@Test
	public void nameLocatorsTest() {
		driver.findElement(By.name("pass")).sendKeys("jkjk");
		driver.findElement(By.name("login")).click();
	}
	
	@Test
	public void linkTestLocatorsTest() {
		driver.findElement(By.linkText("Forgot password?")).click();
	}
	@Test
	public void partiolLinkTestLocatorsTest() {
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgot")).click();
		
	}


}
