package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Elements {
	
	//Login Logout
	public static final By popUpCloseButton = By.className("close-btn");
	public static final By subHeader = By.xpath("//*[text()='Feed Your Whole Family With']");
	public static final By menuButton = By.xpath("//*[@id='header-container']/a[3]");
	public static final By loginButton = By.xpath("//*[@id='header-login']");
	public static final By userNameTextBox = By.xpath("//input[@id='username']");
	public static final By passwordTextBox = By.xpath("//input[@id='password']");
	public static final By signinButton = By.xpath("//button[@id='login-submit']");
	public static final By logoutButton = By.xpath("//*[@id='header-logout']");
	public static final By loginHeader = By.xpath("//span[@class='summary title-summary-login']/preceding-sibling::h1");

	//Location Search
	public static final By locationsButton = By.xpath("//*[@id='header-locations']");
	public static final By locationSearchTextBox = By.xpath("");
	public static final By searchButton = By.xpath("//*[@id='button-location-query']/span");
	public static final By restaurantName = By.xpath("//*[@class='location-summary']/preceding-sibling::h1");
	
	//Rewards
	public static final By noOfRewards = By.xpath("//*[@id='rewards-logged-in-summary-rewards']");
	public static final By actualRewardsCount = By.xpath("//*[@id='active-rewards-carousel']/div[1]/div/div");
	
	//My Account Update
	public static final By myAccountOption = By.xpath("//*[@id='header-account']");
	public static final By emailTextBox = By.xpath("//*[@id='email']");
	public static final By lastNameTextBox = By.xpath("//*[@id='lastName']");
	public static final By consentCheckBox = By.xpath("//*[@for='mobile-opt-in']");
	public static final By updateButton = By.xpath("//button[@type='submit' and text()='Update']");
	public static final By successMessageforUpdate = By.xpath("//span[@class='server-success-message']");
	
    //Chilis Favourites
	public static final By menuOption = By.xpath("//*[@id='header-menu']");
	public static final By favouriteMenu = By.xpath("//*[@id='chilis-favorite-carousel']/div[1]/div/div");
	public static final By favouriteItemsTitle = By.xpath("//div[@class='heading-tertiary heading-favorite']");
	
	//Add My Visit
	public static final By addMyVisitButton = By.xpath("//button[text()='Add My Visit']");
	public static final By restaurantLocTextBox = By.xpath("//*[@id='location-search']");
	public static final By outsideClickLoc = By.xpath("//form[@id='manual-visit-request-form']/div/div/h2");
	public static final By chillisLocDropDown = By.xpath("//*[@id='store-number']");
	public static final By visitMonthDropDown = By.xpath("//*[@id='visit-month']");
	public static final By visitDayDropDown = By.xpath("//*[@id='visit-day']");
	public static final By visitYearDropDown = By.xpath("//*[@id='visit-year']");
	public static final By checkNumberTextBox = By.xpath("//*[@id='check-number']");
	public static final By checkTotalTextBox = By.xpath("//*[@id='check-total']");
	public static final By visitSubmitButton = By.xpath("//*[@id='mvr-confirm']");
	public static final By anyElement = By.xpath("//*[@id=\\\"active-rewards-carousel\\\"]/div[1]/div/div[1]/div/div[3]/span");
	public static final By getSuccessMessageforAddMyVisit = By.xpath("//span[@class='server-success-message']");
	public static final By toGetAddMyVisitButton = By.xpath("//*[@id='page-container']/div/div[4]/div/div/div[1]");	
	public static final By chilisLocationOption = By.xpath("//*[text()='Addison - 4500 Beltline Rd., Dallas, TX 75001']");
	public static final By visitMonthOption = By.xpath("//*[text()='June']");
	public static final By visitDayOption = By.xpath("//*[text()='4']");
	public static final By visitYearOption = By.xpath("//*[text()='2018']");
	public static final By restaurantLocationSearchOption = By.xpath("//*[text()='Addison, TX 75001, USA']");
	
	//Logged In Order
	public static final By orderNowButton = By.xpath("//a[contains(@href,'coit-road')]/following-sibling::a");
	public static final By addToCartButton = By.xpath("//button[@id='item-add-to-order']");
	public static final By viewCartButton = By.xpath("//a[@id='mini-cart-view-upsell']");
	public static final By optSilverWareCheckBox = By.xpath("//label[@for='silverware-opt-in-select']");
	public static final By checkOutButton = By.xpath("//*[@id='cart-checkout']");
	public static final By orderTotal = By.xpath("//div[@class='heading-secondary order-total-label']");
	public static final By deliveryOption = By.xpath("//*[@id='location-001.005.0002']/div[3]/div/div/div/span[2]");
	public static final By addItem = By.xpath("//*[@id='P102596-0']");
	public static final By cartIcon = By.xpath("//img[@alt='Cart']");
	public static final By addRewardsTitle = By.xpath("//h3[@class='accordion-title']");
	public static final By cartTotal = By.xpath("//div[@class='cart-totals']");
	public static final By paymentButton = By.xpath("//*[@id='continue-to-payment']");
	public static final By successMessageforLoggedInOrder =  By.xpath("//*[@id='page-container']/div/div[1]/div[1]/div/h1");
	public static final By orderPrice = By.xpath("//*[@id='pickup-total-confirm']/td[2]/div");
	public static final By placeOrder = By.xpath("//*[@id='place-order-submit']");
	public static final By cvvTextBox = By.xpath("//*[@id='cvv']");
	public static final By tipTextBox = By.xpath("//input[@name='tip']");
	public static final By pickUpCost = By.xpath("//*[@id='pickup-cost']");
	public static final By donationCheckBox = By.xpath("//*[@id='roundup-checkbox-online']");
	public static final By donationCheckBoxPayLater = By.xpath("//*[@id='roundup-checkbox-online']");
	public static final By locationHeader = By.xpath("//*[@id='page-container']/div/div[1]/div/div/div/div[1]/div/h1");
	public static final By silverWareCheckBox = By.xpath("//*[@id='silverware-opt-in-select']");
	
	//Delivery Order **********suman*********//
	public static final By deliveryButton=By.xpath("//button[@id='order-type-delivery-btn']");
	public static final By deliveryLocation=By.xpath("//input[@id='autocomplete']");
	public static final By aptTextbox=By.xpath("//input[@id='suite-no']");
	public static final By deliveryInstrTextbox=By.xpath("//input[@id='special-instructions']");
	public static final By deliveryTimetextbox1=By.xpath("//select[@id='delivery-date']");
	public static final By LaterToday=By.xpath("(//option[contains(text(),'Later Today')])[1]");
	public static final By deliveryTimetextbox2=By.xpath("//select[@id='delivery-time']");
	public static final By dliveryTime=By.xpath("(//option[contains(text(),'7:00 PM')])[1]");
	public static final By termsCheckbox=By.xpath("//input[@id='delivery-sms-disclaimer']");
	public static final By deliveryAsapOrder=By.xpath("(//option[contains(text(),'ASAP')] )[1]");
	
	//CarryOut Order
	public static final By carryOutButton=By.xpath("//button[@id='order-type-carryout-btn']");
	public static final By pickupTimetextbox1=By.xpath("//select[@id='pickup-date']");
	public static final By pickupLaterToday=By.xpath("(//option[contains(text(),'Later Today')])[2]");
	public static final By pickupTimetextbox2=By.xpath("//select[@id='pickup-time']");
	public static final By pickupTime=By.xpath("(//option[contains(text(),'7:00 PM')])[2]");
	public static final By discount=By.xpath("//div[contains(text(),'Discounts')]");
	public static final By placeOrderForPayLater = By.xpath("//button[@id='place-order']");
	
	//Curbside Order
	public static final By curbsideButton=By.xpath("//button[@id='order-type-curbside-btn']");
	public static final By pickupAsapOrder=By.xpath("(//option[contains(text(),'ASAP')] )[2]");
	
	
	//Future Order date
	public static final By pickupFutureDate=By.xpath("(//option[contains(text(),'Monday')])[1]");
	
	
	//Payment Details
	public static final By cardNumberTextBox = By.xpath("//*[@id='cvv']");
	public static final By expirationYearTextBox = By.xpath("//select[@id='year-selector']");
	public static final By expirationYear = By.xpath("//option[contains(text(),'2025')]");
	public static final By nameOnCardTextBox=By.xpath("//input[@id='nameOnCard']");
	public static final By zipcodeTextBox=By.xpath("//input[@id='zipcode']");
	
	
	
	
	//Chili's Menu
	public static final By appetizerButton=By.xpath("//a[@id='menu-category-name-appetizers']");
	public static final By chipsandsalsaButton=By.xpath("//span[contains(text(),'Chips & Salsa')]");
	public static final By tripleDipperButton=By.xpath("//span[contains(text(),'Triple Dipper')]");
	public static final By addToOrder=By.xpath("//button[@id='item-add-to-order']");
	public static final By addRewards=By.xpath("//input[@id='member-reward-1']");
	
	
	
	//Re Order
	public static final By reorderOption = By.xpath("//*[@id='header-order-history']");
	public static final By quantity = By.xpath("//*[@id='items0.quantity']");
	public static final By reOrder = By.xpath("//div[contains(@class,'first-order')]/div[4]/div[2]/form/button");
	public static final By quantityOption = By.xpath("//*[text()='4']");
	
}
