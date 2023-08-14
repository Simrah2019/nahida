package QUALITY_PAGE_ACTION;

import org.testng.Assert;

import QUALITY_PAGE_LOCATORS.Quality_ProfilePageLocator;
import QUALITY_UTILITY.Quality_Base;
import QUALITY_UTILITY.Quality_Utility;

public class Quality_ProfilePageAction extends Quality_Base{
	
	Quality_ProfilePageLocator quality_ProfilePageLocator = new Quality_ProfilePageLocator();

	
	public void Verifyusercanloginwithvalidcard() throws InterruptedException {
		
		Thread.sleep(5000);
		boolean loginverify = quality_ProfilePageLocator.Profileverification.isDisplayed();
		Assert.assertTrue(loginverify);
		Thread.sleep(5000);
		Quality_Utility.takeMyScreenshot(driver, "profile page");
}
}