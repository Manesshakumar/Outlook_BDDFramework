package stepDefinition;

import org.junit.Assert;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.OutlookLoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_StepDefinition extends TestBase {
	
	OutlookLoginPage loginPage ;
	HomePage homepage;
		
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() {
		System.out.println(driver);
		TestBase.initialization();
		System.out.println(driver);
	}
	
	@Then("^The User enters email and password$")
	public void the_User_enters_email_and_password() throws InterruptedException {
		loginPage = new OutlookLoginPage();	
		homepage =loginPage.loginValidation(prop.getProperty("email"),prop.getProperty("password"));
	}
		
	@Then("^The user is on Home Page$")
	public void the_user_is_on_Home_Page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Mail - Maneesha Kumar - Outlook", title);
	}
	
	@And("^Close the Browser$")
	public void close_the_Browser() {
		driver.quit();
	}

}
