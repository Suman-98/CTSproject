package TestScripts;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.BaseIOS;
import Resources.FunctionalComponents;
import Resources.FunctionalComponentsIOS;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class TestFavouriteItemsIOS extends BaseIOS {
	
	@Test
	public void testFavouriteItems() throws InterruptedException
	{
		Logger log = LogManager.getLogger("TestFavouriteItems");
		log.info("******STARTING TEST CHILIS FAVOURITE ITEMS FOR IOS DEVICE******");
		FunctionalComponentsIOS func5 = new FunctionalComponentsIOS(driver,log);
		func5.validateQASite();
		func5.closePopupRewards();
		func5.clickMenuButton();
	    func5.selectLogin();
		func5.enterUserName();
		func5.enterPassword();
		func5.clickSignin();
		func5.clickMenuButton();
		func5.selectMenuOption();
		func5.getAllChilisFavouriteItems();
		
	}
	

}
