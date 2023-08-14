package QUALITY_PAGE_ACTION;

import QUALITY_PAGE_LOCATORS.Quality_ProductPageLocator;
import QUALITY_UTILITY.Quality_Base;

public class Quality_ProductPageActions extends Quality_Base {
	
	Quality_ProductPageLocator quality_ProductPageLocator = new Quality_ProductPageLocator();

	public void clickaddtocart()  {
		
		quality_ProductPageLocator.Addtocartbutton.click();	
		
	}
	public void clickcartLink() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		quality_ProductPageLocator.cartLink.click();
	
		
		
		
		
	}
}
