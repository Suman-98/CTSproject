package TestScripts;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.FunctionalComponents;


public class TestMcaDeliveryAsap extends Base{
	
	Properties property=new Properties();
	
	@Test
	public void testMcaDeliveryAsap() throws Exception {
		
		Logger log = LogManager.getLogger("TestMcaDelivery-Asap");
		log.info("******STARTING TEST MCA DELIVERY-ASAP******");
		FunctionalComponents reorder = new FunctionalComponents(driver,log);
		reorder.validateQASite();
		reorder.closePopupRewards();
		reorder.clickMenuButton();
		reorder.selectLogin();
		reorder.enterUserName();
		reorder.enterPassword();
		reorder.clickSignin();
		reorder.clickMenuButton();
		reorder.selectLocationsOption();
		reorder.enterRestaurantLocation( property.getProperty("location"));
		reorder.clickSearchButton();
		reorder.getRestaurantName();
		reorder.orderNow();
		reorder.AddChilisFavouriteToCart();
		reorder.clickViewCart();
		reorder.selectSilverWare();
		reorder.clickCheckOut();
		
		reorder.clickDeliveryButton ();
		reorder.enterDeliveryLocation(property.getProperty("deliveryLocation"));
		reorder.clickAptTextbox();
		reorder.clickDeliveryInstrBox();
		reorder.selectDeliveryASAP();
		reorder.clickTermsCheckbox();
		reorder.continueToPayment();
		reorder.enterCVV();
		reorder.giveTip();
		reorder.checkRoundOff();
		String priceBeforePlacingOrder = reorder.OrderTotal();
		reorder.placeOrder();
		System.out.println(reorder.getSuccessMessageforLoggedInOrder());
		String priceAfterPlacingOrder = reorder.returnOrderPrice();
		Assert.assertEquals(priceBeforePlacingOrder,priceAfterPlacingOrder,"Incorrect price displayed");
	}

}
