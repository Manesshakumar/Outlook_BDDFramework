package com.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Base.TestBase;

public class HomePage {
	
	@FindBy(xpath = "//div[@class = '_2nUgnl8m3i2htoxK6l4hsn']//a[contains(@title,'Calendar')]" )
	WebElement calendarbtn;
	
	@FindBy(xpath = "//button[@id = 'NewEventButtonAnchor']")
    WebElement newEventbtn;
	
	@FindBy(xpath = "//div[@class ='_2nUgnl8m3i2htoxK6l4hsn']//button[@class = 'ms-Button _36b_ljU_eQu9mGocqbJRt_ ms-Button--commandBar root-53']")
	WebElement emailbtn;
	
	@FindBy(xpath = "//div[@class = 'qtRcagoPZ5dw3xsr114ze']//button")
	WebElement newMessagebtn;
	
	@FindBy(xpath = "//div[@class = '_2nUgnl8m3i2htoxK6l4hsn']//a[contains(@title , 'People')]")
	WebElement peoplebtn;
	
	@FindBy(xpath = "//button[contains(@title,'Create new contact')]")
	WebElement contactbtn;
	
	public HomePage() {
		PageFactory.initElements(TestBase.driver, this);
	}
		
	public CalendarPage calendarbtnClick() {
		calendarbtn.click();
		WebDriverWait wait = new WebDriverWait(TestBase.driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id = 'NewEventButtonAnchor']")));
//		JavascriptExecutor js = (JavascriptExecutor)TestBase.driver;
//		js.executeScript("arguments[0].click();", newEventbtn);
		newEventbtn.click();
		System.out.println("Its Clicked");
		return new CalendarPage();
	}
	
	public EmailComposePage emailbtnClick() {
		emailbtn.click();
		WebDriverWait wait = new WebDriverWait(TestBase.driver,40);
		WebElement targetEmailBtn = wait.until(ExpectedConditions.elementToBeClickable(newMessagebtn));
		targetEmailBtn.click();
		System.out.println("Message Btn Clicked");
		return new EmailComposePage();
	}
	
	
	public ContactPage peoplebtnClick() {
		peoplebtn.click();
		WebDriverWait wait = new WebDriverWait(TestBase.driver,40);
		WebElement targetContactBtn = wait.until(ExpectedConditions.elementToBeClickable(contactbtn));
		targetContactBtn.click();
		System.out.println("Contact Btn Clicked");
		return new ContactPage();
	}
	
	
}
