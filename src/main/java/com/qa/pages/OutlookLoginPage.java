package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.Base.TestBase;

public class OutlookLoginPage  {

	@FindBy(xpath = "//div[@class = 'masthead-shell']//a[contains(text(),'Sign in')]")
	WebElement Signbtn;

	@FindBy(xpath = "//input[@type = 'email']")
	WebElement emailId;

	@FindBy(xpath = "//input[@type = 'submit']")
	WebElement nextbtn;

	@FindBy(xpath = "//input[@type = 'password']")
	WebElement pwd;

	@FindBy(xpath = "//div[@class = 'win-button-pin-bottom']//input[@type = 'submit']")
	WebElement SignInBtn;

	public OutlookLoginPage() {
		System.out.println(TestBase.driver);
		PageFactory.initElements(TestBase.driver,this);		
	}
	
	public HomePage loginValidation(String email,String passwd) throws InterruptedException {
		Signbtn.click();
		emailId.sendKeys(email);
		nextbtn.click();
		pwd.sendKeys(passwd);
		Thread.sleep(3000);
		SignInBtn.click();
    	return new HomePage();
    }
	
	

}
