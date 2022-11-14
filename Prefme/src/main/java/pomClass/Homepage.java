package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	WebDriver driver;
	
	@FindBy(xpath="(//span[@class='line'])[1]")
	private WebElement menu;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath="(//span[@class='nav-label'])[2]")
	private WebElement checkinandcheckout;
	
	@FindBy(xpath="//span[text()='Walk-in Check-in']")
	private WebElement walkinandcheckin ;
	
	@FindBy(xpath="//span[text()='Pickup & Drop']")
	private WebElement pickupanddrop;

	@FindBy(xpath="//span[text()='Preferences']")
	private WebElement preferences;
	
	@FindBy(xpath="//span[text()='User Management']")
	private WebElement usermanagement;
	
	@FindBy(xpath="//span[text()='Hotel Profile']")
	private WebElement HotelProfile;
	
	@FindBy(xpath="//span[text()='Room Inventory']")
	private WebElement RoomInventory;
	
	@FindBy(xpath="//span[text()='Services']")
	private WebElement Services;
	
	@FindBy(xpath="//span[text()='Food & Dining']")
	private WebElement FoodandDining;
	
	@FindBy(xpath="//span[text()='Referral Program']")
	private WebElement Referralprogram;
	
	@FindBy(xpath="//span[text()='Notifications']")
	private WebElement Notifications;
	
	@FindBy(xpath="//span[text()='Help & Support']")
	private WebElement HelpandSupport;
	
	@FindBy(xpath="//span[text()='Billing']")
	private WebElement Billing;
	
	@FindBy(xpath="//span[text()='Activity Log']")
	private WebElement ActivityLog;
	
	@FindBy(xpath="//h4[text()=' Sumit ']")
	private WebElement sumittab;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement yestab;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void Clicksonmenutab()
	{
		menu.click();
	}
	
	public void Clicksondashboard()
	{
		dashboard.click();
	}
	
	public void Clicksoncheckinandcheckout()
	{
		checkinandcheckout.click();
	}
	
	public void Clicksonwalkinandcheckin()
	{
		walkinandcheckin.click();
	}
	
	public void Clicksonpickupanddrop()
	{
		pickupanddrop.click();
	}
	
	public void Clicksonpreferences()
	{
		preferences.click();
	}
	
	public void Clicksonusermanagement()
	{
		usermanagement.click();
	}
	
	public void ClicksonHotelProfile()
	{
		HotelProfile.click();
	}
	
	public void ClicksonRoomInventory()
	{
		RoomInventory.click();
	}
	
	public void ClicksonServices()
	{
		Services.click();
	}
	
	public void ClicksonFoodandDining()
	{
		FoodandDining.click();
	}
	
	public void ClicksonReferralprogram()
	{
		Referralprogram.click();
	}
	public void ClicksonNotifications()
	{
		Notifications.click();
	}
	
	public void ClicksonHelpandSupport()
	{
		HelpandSupport.click();
	}
	
	public void ClicksonBilling() 
	{
		Billing.click();
	}

	
	public void ClicksonActivityLog() 
	{
		ActivityLog.click();
	}
	
//	public void Clicksonsumittab() 
//	{
//		Actions act = new Actions(driver);
//		act.moveToElement(sumittab).click();
//		act.moveToElement(logout).click().perform();	
//	}

	public void sumittab()
	{
		sumittab.click();
	}
	public void Clicksonlogout() 
	{
		logout.click();
	}
	public void clickonYesTab()
	{
		yestab.click();
	}

}
