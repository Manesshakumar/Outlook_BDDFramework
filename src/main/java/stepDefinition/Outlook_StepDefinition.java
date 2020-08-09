package stepDefinition;


import com.qa.Base.TestBase;
import com.qa.pages.CalendarPage;
import com.qa.pages.HomePage;
import com.qa.pages.OutlookLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Outlook_StepDefinition extends TestBase{
	
	OutlookLoginPage loginPage ;
	HomePage homepage;
	CalendarPage calendarpage;
		
	@Given("^User navigate to the login page$")
	public void user_navigate_to_Login_Page() {
		TestBase.initialization();
		System.out.println(driver);
		System.out.println("1");
	}
	
	@When("^User submit emailId and password$")
	public void User_submit_emailId_and_password() throws InterruptedException {
		loginPage = new OutlookLoginPage();	
		homepage =loginPage.loginValidation(prop.getProperty("email"),prop.getProperty("password"));
		System.out.println("2");
	}
		
	@Then("^User should be logged in$")
	public void user_should_be_logged_in() {
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals("Mail - Maneesha Kumar - Outlook", title);
		System.out.println("3");
	}
	
	@When("^The User click Calendar button$")
	public void click_calendar_button() {
		homepage.calendarbtnClick();
		System.out.println("4");
	}
	
	@Then("^User Creates an Event$")
	public void user_creates_an_event() {
		calendarpage = new CalendarPage();
		calendarpage.create_an_event();
		System.out.println("5");
	}
	
	

}
