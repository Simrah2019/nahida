package QUALITY_PAGE_LOCATORS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import QUALITY_UTILITY.Quality_Base;

public class Quality_SigninPageLocator extends Quality_Base{
	
	
	
public Quality_SigninPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "loginusername")
	public WebElement username;
		
	
	
  @FindBy(id = "loginpassword")
   public WebElement password;
	
   @FindBy(xpath = "//button[text()='Log in']")
   public WebElement SigninButton2;

}
