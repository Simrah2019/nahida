package QUALITY_PAGE_ACTION;

import org.openqa.selenium.interactions.Actions;

import QUALITY_PAGE_LOCATORS.Quality_HomePageLocator;
import QUALITY_UTILITY.Quality_Base;

public class Quality_HomePageActions extends Quality_Base{
	
	Quality_HomePageLocator quality_HomePageLocator = new Quality_HomePageLocator();
	
	public void MousehoverSigninlink() {
		
		
		Actions ac = new Actions (driver);
		ac.moveToElement(quality_HomePageLocator.SignUpLink).build().perform();
	}
	
	public void  ClickSignUpLink() throws Exception {
		Thread.sleep(2000);
		quality_HomePageLocator.SignUpLink.click();
		
	}
	public void ClickLoginLink() throws Exception {
		Thread.sleep(2000);
		quality_HomePageLocator.LoginLink.click();	
	}
	public void ClicksamsungGalaxys6() {
		quality_HomePageLocator.samsung6phone.click();
	}
	
	

}
