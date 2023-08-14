package QUALITY_PAGE_LOCATORS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import QUALITY_UTILITY.Quality_Base;

public class Quality_ProfilePageLocator extends Quality_Base{

	
public Quality_ProfilePageLocator() {
		
		PageFactory.initElements(driver, this);
	
}
    @FindBy(id = "nameofuser")
     public WebElement Profileverification;
}