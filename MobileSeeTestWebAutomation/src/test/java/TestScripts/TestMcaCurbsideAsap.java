package TestScripts;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.FunctionalComponents;

public class TestMcaCurbsideAsap extends Base{
	
	 
	@Test
	public void testCurbsideAsapOrder() throws Exception{
		
		Logger log = LogManager.getLogger("TestMcaCurbside-ASAPOrder");
		log.info("******STARTING TEST MCA CURBSIDE-ASAP Order*******");
		FunctionalComponents curb = new FunctionalComponents(driver,log);
		curb.validateQASite();
		curb.closePopupRewards();
		curb.clickMenuButton();
		curb.selectLogin();
		curb.enterUserName();
		curb.enterPassword();
		curb.clickSignin();
		curb.clickMenuButton();
		curb.selectLocationsOption();
		curb.enterRestaurantLocation( prop.getProperty("location"));
		curb.clickSearchButton();
		curb.getRestaurantName();
		curb.orderNow();
		curb.clickOnMenuCategory(2);
		curb.clickOnMenuItem(3);
		curb.addToOrder();
		curb.clickViewCartButton();
		curb.selectSilverWare();
		curb.clickCheckOut();
		curb.clickOnCurbSideButton();
		curb.selectPickupAsap();
		curb.clickTermsCheckbox();
		curb.continueToPayment();
		curb.enterCardNumber();
		curb.enterCVV();
		curb.selectExpirationYear();
		curb.enterNameOnCard();
		curb.enterZipcode();
		curb.giveTip();
		curb.checkRoundOff();
		String priceBeforePlacingOrder = curb.OrderTotal();
		curb.placeOrder();
		System.out.println(curb.getSuccessMessageforLoggedInOrder());
		String priceAfterPlacingOrder = curb.returnOrderPrice();
		Assert.assertEquals(priceBeforePlacingOrder,priceAfterPlacingOrder,"Incorrect price displayed");
		
		
	}
	
	

}
