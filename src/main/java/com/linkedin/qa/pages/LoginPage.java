package com.linkedin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.linkedin.qa.base.Testbase;

public class LoginPage extends Testbase{
	@FindBy(name = "session_key")
	WebElement email;
	
	@FindBy(name = "session_password")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"password-visibility-toggle\"]")
	WebElement showToggle;
		
	@FindBy(xpath = "//*[@id=\"organic-div\"]/form/a")
	WebElement forgotPassword;
	
	@FindBy(xpath = "//*[@id=\"organic-div\"]/form/div[3]/button")
	WebElement loginBtn;
	
	@FindBy(xpath = "/html/body/nav/a/icon/svg")
	WebElement linkedInLogo;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLinkedInImage() {
		return linkedInLogo.isDisplayed();
	}
	
	public void login(String usename, String pwd) {
		email.sendKeys(usename);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	


}
