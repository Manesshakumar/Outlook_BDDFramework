//package stepDefinition;
//
//import org.junit.Assert;
//
//import com.qa.Base.TestBase;
//import com.qa.pages.HomePage;
//import com.qa.pages.OutlookLoginPage;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//public class CalendarEventPageCheck extends TestBase{
//	
//	OutlookLoginPage loginPage ;
//	HomePage homepage;
//	
//	@Given("^User is already on login page$")
//	public void user_is_on_Login_Page() {
//		System.out.println(driver);
//		TestBase.initialization();
//		System.out.println(driver);
//	}
//	
//	@Then("^The User enters valid email and password$")
//	public void the_User_enters_email_and_password() throws InterruptedException {
//		loginPage = new OutlookLoginPage();	
//		homepage =loginPage.loginValidation(prop.getProperty("email"),prop.getProperty("password"));
//	}
//	
//	@And("^user is on home page$")
//	public void the_user_is_on_home_Page() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Mail - Maneesha Kumar - Outlook", title);
//	}
//	@Then("^Click Calendar button$")
//	public void click_calendar_button() {
//		homepage.calendarbtnClick();
//	}
//
//}
