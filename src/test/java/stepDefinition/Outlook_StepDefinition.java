package stepDefinition;


import java.util.List;
import java.util.Map;

import com.qa.Base.TestBase;
import com.qa.pages.CalendarPage;
import com.qa.pages.ContactPage;
import com.qa.pages.EmailComposePage;
import com.qa.pages.HomePage;
import com.qa.pages.OutlookLoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Outlook_StepDefinition extends TestBase{
	
	@After
	public void tearDown() {
		System.out.println("-----------------End of Scenario-----------------");
		driver.quit();
	}
	
	OutlookLoginPage loginPage ;
	HomePage homepage;
	CalendarPage calendarpage;
	EmailComposePage emailComposePage;
	ContactPage contactpage;
		
	@Given("^User navigate to the login page$")
	public void user_navigate_to_Login_Page() {
		TestBase.initialization();
		
	}
	
	@When("^User submit emailId and password$")
	public void User_submit_emailId_and_password() throws InterruptedException {
		loginPage = new OutlookLoginPage();	
		homepage =loginPage.loginValidation(prop.getProperty("email"),prop.getProperty("password"));
		
	}
		
	@Then("^User should be logged in$")
	public void user_should_be_logged_in() {
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals("Mail - Maneesha Kumar - Outlook", title);
		
	}
	
	@When("^The User click Calendar button$")
	public void click_calendar_button() {
		homepage.calendarbtnClick();
		
	}
	
	@Then("^User Creates an Event$")
	public void user_creates_an_event() throws InterruptedException {
		calendarpage = new CalendarPage();
		calendarpage.create_an_event();
		System.out.println("5");
	}
	
	@When("^The User click email button$")
	public void click_email_button() {
		homepage.emailbtnClick();
		
	}
	
	@Then("^User compose an email$")
	public void user_compose_an_email() throws InterruptedException {
		emailComposePage = new EmailComposePage();
		emailComposePage.compose_a_mail();
		
	}

	
	@When("^The User click Contact button$")
	public void click_contact_button() {
		homepage.peoplebtnClick();
		
	}
	
	@Then("^User creates a contact$")
	public void user_creates_a_contact(DataTable usercredentials) {
		List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
		contactpage = new ContactPage();
		contactpage.createContact(data);
		
	}
}
