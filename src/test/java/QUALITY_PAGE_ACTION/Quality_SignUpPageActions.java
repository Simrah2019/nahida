package QUALITY_PAGE_ACTION;

import QUALITY_PAGE_LOCATORS.Quality_SignUpPageLocator;
import QUALITY_TESTDATA.Quality_TestData;
import QUALITY_UTILITY.Quality_Base;

public class Quality_SignUpPageActions extends Quality_Base{
	
	
	Quality_SignUpPageLocator quality_SignUpPageLocator = new Quality_SignUpPageLocator();
	
	
	public void Enterusernamepassword() throws InterruptedException {
		
		quality_SignUpPageLocator.Q_UserName.sendKeys(Quality_TestData.user5);
		Thread.sleep(3000);
		quality_SignUpPageLocator.Q_Password.sendKeys(Quality_TestData.passwords);
	}
	
	public void ClickSingUpbutton() throws InterruptedException {
		quality_SignUpPageLocator.Q_SignUpButton.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

}
