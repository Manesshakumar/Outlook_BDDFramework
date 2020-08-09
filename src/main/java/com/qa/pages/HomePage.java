package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Base.TestBase;

public class HomePage {
	
	@FindBy(xpath = "//div[@class = 'ms-OverflowSet-item item-62']//div//a//span[@class='ms-Button-flexContainer flexContainer-45']//i[@data-icon-name ='Calendar' ]" )
	WebElement calendarbtn;
	
	@FindBy(xpath = "//div[@class = '_2r0KOOdyTRMoSTZlhRiivE']//button[@id = 'NewEventButtonAnchor']")
    WebElement newEventbtn;
	
	public HomePage() {
		PageFactory.initElements(TestBase.driver, this);
	}
		
	public CalendarPage calendarbtnClick() {
		calendarbtn.click();
//		try {
//			Thread.sleep(2000);
//		}catch(InterruptedException e) {
//			Thread.currentThread().interrupt();
//		}
		WebDriverWait wait = new WebDriverWait(TestBase.driver,40);
		WebElement targetEventBtn = wait.until(ExpectedConditions.elementToBeClickable(newEventbtn));
//		JavascriptExecutor js = (JavascriptExecutor)TestBase.driver;
//		js.executeScript("arguments[0].click();", newEventbtn);
		targetEventBtn.click();
		System.out.println("Its Clicked");
		return new CalendarPage();
	}
	
	
	
}
