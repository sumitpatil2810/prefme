package pomClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChechInandCheckOut 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='btn GTMmenu mobile-toggle open']")
	private WebElement menutab;
	
	@FindBy(xpath="//span[text()='Check-in & Checkout']")
	private WebElement CheckinAndCheckout;
	
	@FindBy(xpath="(//a[@routerlinkactive='active-link'])[1]")
	private WebElement ExpectedArrivals;
	
	@FindBy(xpath="//button[@class='btn table-filter filter-on']")
	private WebElement TodayTab;
	
	@FindBy(xpath="(//button[@class=\"btn table-filter\"])[1]")
	private WebElement TomorrowTtab;
	
	@FindBy(xpath="(//button[@class='btn table-filter'])[2]")
	private WebElement AllGuestsTab;
	
	@FindBy(xpath="//button[text()=' Add New Reservation ']")
	private WebElement AddNewReservationtab;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[1]")
	private WebElement CheckInDate;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement CheckOutDate;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='mobNo']")
	private WebElement MobileNo;
	
	@FindBy(xpath="(//div[@class='ngx-select__toggle btn form-control'])[3]")
	private WebElement NoOfRooms;
	
	@FindBy(xpath="(//div[@class='ngx-select__toggle btn form-control'])[4]")
	private WebElement Adult;
	
	@FindBy(xpath="(//div[@class='ngx-select__toggle btn form-control'])[5]")
	private WebElement child;
	
	@FindBy(xpath="(//div[@class='ngx-select__toggle btn form-control'])[6]")
	private WebElement BookingStatus;
	
	@FindBy(xpath="(//div[@class='ngx-select__toggle btn form-control'])[7]")
	private WebElement RoomCategory;
	
	@FindBy(xpath="//label[text()=' Send Online Check-in Form ']")
	private WebElement SendOnlinecheckInForm;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Submit;
	
	public ChechInandCheckOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void open() 
	{
	     
		Actions act = new Actions(driver);
		act.moveToElement(menutab).click().build().perform();
		act.moveToElement(CheckinAndCheckout).click().build().perform();
	}
	public void AddNewReservation()
	{
		AddNewReservationtab.click();
		
		
	}
	public void CheckInDate ()
	{
		Select s= new Select(CheckInDate);
		s.selectByValue("15");
	}

	public void CheckOutDate()
	{
		Select s= new Select(CheckOutDate);
		s.selectByValue("15");
	}
	public void name() throws InterruptedException
	{
		Thread.sleep(3000);
		FirstName.sendKeys("Sumit");
		LastName.sendKeys("Patil");
		Email.sendKeys("sumeet.patil0707@gmail.com");
		MobileNo.sendKeys("7620636312");
			
	}
	public void rooms() throws InterruptedException
	{
		Thread.sleep(2000);
		Select s= new Select(NoOfRooms);
		s.selectByValue("2");
	}
	
	public void adult() throws InterruptedException
	{
		Thread.sleep(2000);
		Select s= new Select(Adult);
		s.selectByValue("2");
	}
	public void child() throws InterruptedException
	{
		Thread.sleep(2000);
		Select s= new Select(child);
		s.selectByValue("0");
	}
	public void BookingStatus() throws InterruptedException
	{
		Thread.sleep(2000);
		Select s = new Select(BookingStatus);
		s.selectByValue("1");
	}
	public void RoomCategory() throws InterruptedException
	{
		Thread.sleep(2000);
		Select s = new Select(RoomCategory);
		s.selectByValue("2");
	}
	public void FinalStep()
	{
		SendOnlinecheckInForm.click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		Submit.click();
		
		
	}
}
