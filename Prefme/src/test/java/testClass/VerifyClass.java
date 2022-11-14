package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.Homepage;
import pomClass.LoginPage;


public class VerifyClass
{
	WebDriver driver;
	LoginPage login;
	Homepage homepage;

	public static void main(String[]args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://prefme.in/partner/#/login");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		LoginPage login = new LoginPage(driver);
		//login.username();
		//login.pass();
		login.login();
		
		
		Homepage homepage = new Homepage(driver);
		
		homepage.Clicksoncheckinandcheckout();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		
		if(url.equals("https://prefme.in/partner/#/dashboard") && title.equals("Hotel Partner"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	
		homepage.Clicksonlogout();
		
		driver.close();
		
		
		
		
		
		
	}


}
