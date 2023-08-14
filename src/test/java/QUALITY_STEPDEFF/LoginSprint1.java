package QUALITY_STEPDEFF;

import QUALITY_PAGE_ACTION.Quality_HomePageActions;
import QUALITY_PAGE_ACTION.Quality_ProfilePageAction;
import QUALITY_PAGE_ACTION.Quality_SignUpPageActions;
import QUALITY_PAGE_ACTION.Quality_SigninPageActions;
import QUALITY_UTILITY.Quality_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSprint1 extends Quality_Base {
	
	Quality_HomePageActions quality_HomePageActions = new Quality_HomePageActions();
	Quality_SignUpPageActions quality_SignUpPageActions = new Quality_SignUpPageActions();
	Quality_ProfilePageAction quality_ProfilePageAction = new Quality_ProfilePageAction();
	Quality_SigninPageActions quality_SigninPageActions = new Quality_SigninPageActions();
	
	@Given("^open \"([^\"]*)\" Application$")
	public void open_Application(String URL) throws Throwable {
		QualityLuanchingURL(URL);
	}

	@Then("^Click SignupLink$")
	public void click_SignupLink() throws Throwable {
		quality_HomePageActions.ClickSignUpLink();
	}

	@Then("^Enter user password$")
	public void enter_user_password() throws Throwable {
	    
		quality_SignUpPageActions.Enterusernamepassword(); 
	}

	@Then("^click SignUp button$")
	public void click_SignUp_button() throws Throwable {
		quality_SignUpPageActions.ClickSingUpbutton();
	}

	@Then("^Click Login Link$")
	public void click_Login_Link() throws Throwable {
		quality_HomePageActions.ClickLoginLink();
	}
	@Then("^Enter username password$")
	public void enter_username_password() throws Throwable {
		quality_SigninPageActions.Quality_UserCard(hi.getProperty("UserName1"), hi.getProperty("Password1"));
		
	}

	@Then("^Verify user can login with valid card$")
	public void verify_user_can_login_with_valid_card() throws Throwable {
		quality_ProfilePageAction.Verifyusercanloginwithvalidcard(); 
	}}




 
	    
	


	
	
	
	
	


