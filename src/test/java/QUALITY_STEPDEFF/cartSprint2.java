package QUALITY_STEPDEFF;

import QUALITY_PAGE_ACTION.Quality_CartPageActions;
import QUALITY_PAGE_ACTION.Quality_HomePageActions;
import QUALITY_PAGE_ACTION.Quality_ProductPageActions;
import QUALITY_UTILITY.Quality_Base;
import cucumber.api.java.en.Then;

public class cartSprint2 extends Quality_Base{
	
	
	Quality_CartPageActions quality_CartPageActions = new  Quality_CartPageActions();
	Quality_HomePageActions quality_HomePageActions = new Quality_HomePageActions();
	Quality_ProductPageActions quality_ProductPageActions = new Quality_ProductPageActions();
	
	@Then("^Click samsung Galaxys(\\d+)$")
	public void click_samsung_Galaxys(int arg1) throws Throwable {
		quality_HomePageActions.ClicksamsungGalaxys6(); 
	}

	@Then("^click add to cart$")
	public void click_add_to_cart() throws Throwable {
		quality_ProductPageActions.clickaddtocart();
	}

	@Then("^click cart Link$")
	public void click_cart_Link() throws Throwable {
		quality_ProductPageActions.clickcartLink();
	}

	@Then("^Verify user can add item in cart$")
	public void verify_user_can_add_item_in_cart() throws Throwable {
		quality_CartPageActions.Verifyusercanadditemincart();
	}



}
