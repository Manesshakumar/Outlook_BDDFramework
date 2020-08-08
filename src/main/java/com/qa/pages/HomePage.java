package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class HomePage {
	
	
	@FindBy(xpath = "//div[@class = 'ms-OverflowSet-item item-62']//div//a//span[@class='ms-Button-flexContainer flexContainer-45']//i[@data-icon-name ='Calendar' ]" )
	WebElement calendarbtn;
	
	@FindBy(xpath = "//div[@class = '_2r0KOOdyTRMoSTZlhRiivE']//span[@class='ms-Button-label sDjQm2-pu3zdQ7E2MIynW label-54']")
    WebElement newEventbtn;
	
	
	public HomePage() {
		PageFactory.initElements(TestBase.driver, this);
	}
		
	public CalendarPage calendarbtnClick() {
		calendarbtn.click();
		newEventbtn.click();
		return new CalendarPage();
	}
	
	
	
}
