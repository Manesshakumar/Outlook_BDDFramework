package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class CalendarPage {

	@FindBy(xpath = "//div[@class = 'ms-TextField-fieldGroup fieldGroup-163']//input[@class = 'ms-TextField-field field-164']")
	WebElement addTitle;

	@FindBy(xpath = "//input[@class='ms-BasePicker-input pickerInput_34694d2a']")
	WebElement searchLocation;

	@FindBy(xpath = "//button[@class = 'ms-Button ms-Button--action ms-Button--command _17L9p5JiFh3SCKtydh4NGU root-214']")
	WebElement savebtn;
	
	@FindBy(xpath = "//div[@class='ms-Suggestions-container suggestionsContainer_d6f75437']//div//span//div[@class='container-228']//div[@class = 'personaText-231']//span[@class = 'gdHcIp0K_u5Oq4AhHfyK1 _1z9_llUB_9llYO_-6aedlB']")
	List<WebElement> locationList;

	public CalendarPage() {
		PageFactory.initElements(TestBase.driver, this);
	}

  public void create_an_event() throws InterruptedException {
	  addTitle.sendKeys("Flight");
	  searchLocation.click();
	  searchLocation.sendKeys("Chennai");
	  int loccount = locationList.size();
	  System.out.println("The Location Suggestions are : " +loccount);
	  for(int i=0;i <= loccount;i++ ) {
      	String location = locationList.get(i).getText();
      	System.out.println(location);
      	if(location.equals("Chennai International Airport")) {
      		locationList.get(i).click();
      		break;
      	}
      }	  
	
	  savebtn.click();
	  Thread.sleep(1000);
	}
  
  
  
	  
  }



