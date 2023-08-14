package QUALITY_PAGE_ACTION;

import org.testng.Assert;

import QUALITY_PAGE_LOCATORS.Quality_CartPageLocator;
import QUALITY_UTILITY.Quality_Base;
import QUALITY_UTILITY.Quality_Utility;

public class Quality_CartPageActions extends Quality_Base{
	
	Quality_CartPageLocator quality_CartPageLocator = new Quality_CartPageLocator();

	Quality_HomePageActions qality_HomePageActions = new Quality_HomePageActions();
	

public void Verifyusercanadditemincart() throws Exception {
	
	Thread.sleep(5000);
	boolean cartverification = quality_CartPageLocator.VerifyCart.isDisplayed();
	
	Assert.assertTrue(cartverification);
	Quality_Utility.takeMyScreenshot(driver, "Cart page");
}}
