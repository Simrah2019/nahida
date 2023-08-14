package QUALITY_PAGE_LOCATORS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import QUALITY_UTILITY.Quality_Base;

public class Quality_CartPageLocator extends Quality_Base{
	
	
public Quality_CartPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//td[text()='Samsung galaxy s6']")
	public WebElement VerifyCart;
	
	
	}
	
	
	
	


