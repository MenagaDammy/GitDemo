package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	
	
	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("User is in the landing page of facebok");
	   
	}

//	@When("^User login by giving username and password$")
//	public void user_login_by_giving_username_and_password() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("User entered username and password");
//	   
//	}

	@When("^User login by giving username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_by_giving_username_and_password(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User entered username : " + username + " and password : " + password );
	   
	}
	
	@Then("^Home page is \"([^\"]*)\"$")
	public void home_page_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is " + arg1);
	}

//@menaga changed it
	
	
}
