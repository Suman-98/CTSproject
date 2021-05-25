package TestScripts;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.Base;
import Resources.FunctionalComponents;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestLoginLogout extends Base {
	
	
	
	
	@Test
	public void testLoginFeature() throws Exception
	{
		Logger log = LogManager.getLogger("TestLoginLogout");
		log.info("******STARTING TEST LOGIN LOGOUT******");
		FunctionalComponents func = new FunctionalComponents(driver,log);
		func.validateQASite();
		func.closePopupRewards();
		func.clickMenuButton();
		func.selectLogin();
		func.enterUserName();
		func.enterPassword();
		func.clickSignin();
		func.clickMenuButton();
		func.logout();
		System.out.println(func.validateLogout());
	}
	
	
	
	
	

}
