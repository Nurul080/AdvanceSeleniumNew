package com.facebook.pom_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
	WebDriver driver;

	public LoginPageWithPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using="email") WebElement userNameId;
	public WebElement userNameMethod (String enterYourName){
		userNameId.sendKeys(enterYourName);
		return userNameId;
		
	}
	
	@FindBy(how = How.NAME, using="pass")WebElement passwordLocator;
	public WebElement passWordMethod(String enterYourPassword) {
		passwordLocator.sendKeys(enterYourPassword);
		return passwordLocator;
	}
	@FindBy(how=How.XPATH, using="//button[starts-with(@id,'u_0_5_')]")	private WebElement loginButtonLocator;

	public void logingButton() {
		loginButtonLocator.click();
	}
		

}
