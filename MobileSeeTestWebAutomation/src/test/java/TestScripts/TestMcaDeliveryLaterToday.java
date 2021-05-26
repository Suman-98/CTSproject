package TestScripts;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.FunctionalComponents;

public class TestMcaDeliveryLaterToday extends Base{
	
	Properties property=new Properties();
	
	@Test
	public void testMcaDeliveryLaterToday() throws Exception{
		
		Logger log = LogManager.getLogger("TestMcaDelivery-LaterToday");
		log.info("******STARTING TEST MCA DELIVERY-LaterToday******");
		FunctionalComponents deliverylt = new FunctionalComponents(driver,log);
		deliverylt.validateQASite();
		deliverylt.closePopupRewards();
		deliverylt.clickMenuButton();
		deliverylt.selectLogin();
		deliverylt.enterUserName();
		deliverylt.enterPassword();
		deliverylt.clickSignin();
		deliverylt.clickMenuButton();
		deliverylt.selectLocationsOption();
		deliverylt.enterRestaurantLocation( property.getProperty("location"));
		deliverylt.clickSearchButton();
		deliverylt.getRestaurantName();
		deliverylt.orderNow();
		deliverylt.AddChilisFavouriteToCart();
		deliverylt.clickViewCart();
		deliverylt.selectSilverWare();
		deliverylt.clickCheckOut();
		deliverylt.clickDeliveryButton();
		deliverylt.enterDeliveryLocation(property.getProperty("deliveryLocation"));
		deliverylt.clickAptTextbox();
		deliverylt.clickDeliveryInstrBox();
		deliverylt.selectDeliveryLaterToday();
		deliverylt.selectDeliveryTime();
		deliverylt.clickTermsCheckbox();
		deliverylt.continueToPayment();
		deliverylt.enterCVV();
		deliverylt.giveTip();
		deliverylt.checkRoundOff();
		String priceBeforePlacingOrder = deliverylt.OrderTotal();
		deliverylt.placeOrder();
		System.out.println(deliverylt.getSuccessMessageforLoggedInOrder());
		String priceAfterPlacingOrder = deliverylt.returnOrderPrice();
		Assert.assertEquals(priceBeforePlacingOrder,priceAfterPlacingOrder,"Incorrect price displayed");
		
	}

}
