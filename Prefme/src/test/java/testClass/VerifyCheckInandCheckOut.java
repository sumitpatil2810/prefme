package testClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.ChechInandCheckOut;
import pomClass.Homepage;
import pomClass.LoginPage;

public class VerifyCheckInandCheckOut 
{
	WebDriver driver ;
	LoginPage login;
	Homepage homepage;
	ChechInandCheckOut checkin;
	
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://prefme.in/partner/#/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		LoginPage login = new LoginPage(driver);
		
		login.login();
		
		Homepage homepage = new Homepage(driver);

		ChechInandCheckOut checkin = new ChechInandCheckOut(driver);
		checkin.open();
		
		checkin.AddNewReservation();
		
		
	     homepage.Clicksonlogout();
		
		driver.close();
		
		
	}
	

}
