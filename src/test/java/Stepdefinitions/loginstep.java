package Stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.loginpage;
import utils.BaseClass;

public class loginstep extends BaseClass {
 
	loginpage lp = new loginpage(driver);
	
	@Given("user launches browser")
	public void user_launches_browser() {
	    lp.setup();
	    
	    lp=new loginpage(driver);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {

	    lp.enterusername("Sourabh@123");
	    lp.enterpass("Test@123");
	    lp.clicklogin();
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() throws IOException {
		
	    System.out.println("Login Successful");
	    
	    lp.Screenshot();
	    lp.closebrowser();
	}	
}
