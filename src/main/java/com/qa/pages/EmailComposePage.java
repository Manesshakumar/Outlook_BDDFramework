package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class EmailComposePage {
	
	@FindBy(xpath = "//div[@class = 'ms-BasePicker-text pickerText_34694d2a']//input")
	WebElement toBtn;
	
	@FindBy(xpath = "//div[@class = 'ms-TextField-wrapper']//input")
	WebElement addSubject;
	
	@FindBy(xpath = "//div[@class = '_4utP_vaqQ3UQZH0GEBVQe B1QSRkzQCtvCtutReyNZ _17ghdPL1NLKYjRvmoJgpoK _2s9KmFMlfdGElivl0o-GZb']//div")
    WebElement msgBody;
	
	@FindBy(xpath = "//button[contains(@title, 'Send (Ctrl+Enter)')]")
	WebElement sendbtn;
	
	public EmailComposePage() {
		PageFactory.initElements(TestBase.driver, this);
	}
	
	 public void compose_a_mail() throws InterruptedException {
		 toBtn.sendKeys(TestBase.prop.getProperty("email"));
		 addSubject.sendKeys("Automation Test");
		 StringBuffer textArea = new StringBuffer().append("This is my First Message");
		 msgBody.sendKeys(textArea);	
		 sendbtn.click();
		 Thread.sleep(1000);
}
	 
}
