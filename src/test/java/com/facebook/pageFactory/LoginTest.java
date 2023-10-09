package com.facebook.pageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	String userNameId = "email";
	String passWordId = "pass";


	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");

	}

	@Test
	public void validLoginTest() {
		findById(userNameId).sendKeys("muhit");
		findById(passWordId).sendKeys("ppp");
		
	}

	@Test
	public void invalidLoginTest() {
		findById(userNameId).sendKeys("muhit");
		findById(passWordId).sendKeys("ppp");
		
	}
	@Test
	public void boundaryLoginTest() {
		findById(userNameId).sendKeys("muhit");
		findById(passWordId).sendKeys("ppp");
		
		
	}

	public WebElement findById(String id) {
		return driver.findElement(By.id(id));
	}
}
