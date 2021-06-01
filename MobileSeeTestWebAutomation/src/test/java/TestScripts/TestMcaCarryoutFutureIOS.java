package TestScripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.BaseIOS;
import Resources.FunctionalComponents;
import Resources.FunctionalComponentsIOS;

public class TestMcaCarryoutFutureIOS extends BaseIOS {
	

	@Test
	public void testCarryoutFutureOrder() throws Exception {
		
		Logger log = LogManager.getLogger("Test Carryout Future Order as Mca User");
		log.info("******STARTING TEST CARRYOUT FOR FUTURE ORDER FOR IOS DEVICES********");
		FunctionalComponentsIOS cfo = new FunctionalComponentsIOS(driver,log);
		cfo.validateQASite();
		cfo.closePopupRewards();
		cfo.clickMenuButton();
		cfo.selectLogin();
		cfo.enterUserName();
		cfo.enterPassword();
		cfo.clickSignin();
		cfo.clickMenuButton();
		cfo.selectLocationsOption();
		cfo.enterRestaurantLocation( prop.getProperty("location"));
		cfo.clickSearchButton();
		cfo.getRestaurantName();
		cfo.orderNow();
		cfo.AddChilisFavouriteToCart();
		cfo.clickViewCart();
		cfo.selectSilverWare();
		cfo.clickCheckOut();
		cfo.clickOnCarryOut();
		cfo.selectPickupForFuture();
		cfo.selectPickupTime();
		cfo.checkRoundOffAtResturent();
		String priceBeforePlacingOrder = cfo.OrderTotal();
		cfo.placeOrderForPayAtResturent();
		Thread.sleep(15000);
		System.out.println(cfo.getSuccessMessageforLoggedInOrder());
		String priceAfterPlacingOrder = cfo.returnOrderPrice();
		Assert.assertEquals(priceBeforePlacingOrder,priceAfterPlacingOrder,"Incorrect price displayed");
		
	}


}
