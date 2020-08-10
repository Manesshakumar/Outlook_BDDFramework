package com.qa.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class ContactPage {
	
	@FindBy(xpath = "//input[@id = 'GivenName']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id = 'Surname']")
	WebElement surname;
	
	@FindBy(xpath = "//div[@class = 'rightFooter-350']//button[@data-log-name = 'ContactEditorSave']")
	WebElement create;
	
	public ContactPage() {
		PageFactory.initElements(TestBase.driver, this);
	}
	
	public void createContact(List<Map<String, String>> data) {
		firstName.sendKeys(data.get(0).get("FirstName"));
		surname.sendKeys(data.get(0).get("LastName"));
		create.click();
	}
}
