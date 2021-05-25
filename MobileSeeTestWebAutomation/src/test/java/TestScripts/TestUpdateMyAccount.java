package TestScripts;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.Base;
import Resources.FunctionalComponents;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestUpdateMyAccount extends Base {
	
	
	@Test
	public void testUpdateAccountFeature() throws InterruptedException
	{
		Logger log = LogManager.getLogger("TestUpdateAccount");
		log.info("******STARTING TEST UPDATE ACCOUNT******");
		FunctionalComponents func4  = new FunctionalComponents(driver,log);
		func4.validateQASite();
		func4.closePopupRewards();
		func4.clickMenuButton();
		func4.selectLogin();
		func4.enterUserName();
		func4.enterPassword();
		func4.clickSignin();
		func4.clickMenuButton();
		func4.selectMyAccountOption();
		func4.updateLastName();
		func4.updateEmail();
		func4.checkConsent();
		func4.clickUpdateButton();
		System.out.println(func4.getSuccessMessage());
		
	}
	

}
