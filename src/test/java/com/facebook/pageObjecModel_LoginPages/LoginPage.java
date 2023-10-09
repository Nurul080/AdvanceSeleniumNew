package com.facebook.pageObjecModel_LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;//instance variable
	


	public LoginPage(WebDriver driver) { // user define constructor
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this );// pop constructor
	}
	
	
	public WebElement userName(String enterYourUserName) {
		WebElement uName = driver.findElement(By.cssSelector("#email"));
		uName.clear();
		uName.sendKeys(enterYourUserName);
		System.out.println("whar is thr tag name" + uName.getTagName());
		return uName;
	}
	
	public WebElement passeord(String enterYourPassowrd) {
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.clear();
		pass.sendKeys(enterYourPassowrd);
		return pass;
	}
	
	public void clickLoginButton() {
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
	}
	public WebElement forgetPassowrd() {
		WebElement forgetPass=	driver.findElement(By.linkText("Forgot password?"));
		forgetPass.click();
		return forgetPass;
		
	}
	public WebElement createNewAccount() {
		WebElement newAccount =driver.findElement(By.linkText("Create new account"));
		newAccount.click();
		return newAccount;
	}

}
