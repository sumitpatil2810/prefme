package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	WebDriver driver;
	
	@FindBy(xpath="//input[@formcontrolname='prefmeno']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement login;

	@FindBy(xpath="//a[text()='Forgot password?']")
	private WebElement forgat;
	
	@FindBy(xpath="//small[text()='Do not have an account?']")
	private WebElement Donothaveanaccount;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	private WebElement signup;
	
	public LoginPage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
		this.driver=driver;
	
	}
	
	public void username(String user)
	{
		username.sendKeys(user);
	}
	
	public void pass(String password)
	{
		pass.sendKeys(password);
	}
	
	public void login()
	{
		login.click();
	}
	
}
