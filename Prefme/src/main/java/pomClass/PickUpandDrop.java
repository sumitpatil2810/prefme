package pomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PickUpandDrop
{
	@FindBy(xpath="(//span[@class='nav-label'])[4]")
	private WebElement PickUpAndDrop;
	
	@FindBy(xpath="(//a[@routerlinkactive='active-link'])[1]")
	private WebElement PickupRequest ;

	
	@FindBy(xpath="//button[@class='btn table-filter filter-on']")
	private WebElement Today;

	
	@FindBy(xpath="(//button[@class='btn table-filter'])[1]")
	private WebElement Tomorrow;

	
	@FindBy(xpath="(//button[@class='btn table-filter'])[2]")
	private WebElement Upcoming;

	
	@FindBy(xpath="(//button[@class='btn table-filter'])[3]")
	private WebElement History;

	
	@FindBy(xpath="//button[@class='btn btn-black']")
	private WebElement AddNewPickup;

	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement FirstName;

	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement LastName;

	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement PickUpDate;

//	@FindBy(xpath="")
//	private WebElement tab ;
//
//	@FindBy(xpath="")
//	private WebElement tab ;
//
//	@FindBy(xpath="")
//	private WebElement tab ;
//
//	@FindBy(xpath="")
//	private WebElement tab ;
//
//	@FindBy(xpath="")
//	private WebElement tab ;

	

}
