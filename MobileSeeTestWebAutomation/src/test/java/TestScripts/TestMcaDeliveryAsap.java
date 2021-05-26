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
		FunctionalComponents testfc = new FunctionalComponents(driver,log);
		testfc.validateQASite();
		testfc.closePopupRewards();
		testfc.clickMenuButton();
		testfc.selectLogin();
		testfc.enterUserName();
		testfc.enterPassword();
		testfc.clickSignin();
		testfc.clickMenuButton();
		testfc.selectLocationsOption();
		testfc.enterRestaurantLocation( property.getProperty("location"));
		testfc.clickSearchButton();
		testfc.getRestaurantName();
		testfc.orderNow();
		testfc.AddChilisFavouriteToCart();
		testfc.clickViewCart();
		testfc.selectSilverWare();
		testfc.clickCheckOut();
		testfc.clickDeliveryButton ();
		testfc.enterDeliveryLocation(property.getProperty("deliveryLocation"));
		testfc.clickAptTextbox();
		testfc.clickDeliveryInstrBox();
		testfc.selectDeliveryASAP();
		testfc.clickTermsCheckbox();
		testfc.continueToPayment();
		testfc.enterCVV();
		testfc.giveTip();
		testfc.checkRoundOff();
		String priceBeforePlacingOrder =testfc.OrderTotal();
		testfc.placeOrder();
		System.out.println(testfc.getSuccessMessageforLoggedInOrder());
		String priceAfterPlacingOrder =testfc.returnOrderPrice();
		Assert.assertEquals(priceBeforePlacingOrder,priceAfterPlacingOrder,"Incorrect price displayed");
	}

}
