package TestPackage;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pages.LoginPage;
public class TestFunda extends LoginPage{
	
	
	

	
//	@BeforeMethod
//	public void Property()
//	{
//		//System.setProperty("webdriver.chrome.driver", ".//MyDrivers//chromedriver.exe");
//		driver=new ChromeDriver();
//	
//			  
//		driver.get("https://www.toolsqa.com/automation-practice-form/");
//		driver.manage().window().maximize();
//	}
//		
	@BeforeMethod
		@Parameters(value={"browser"})
//		@Parameters(value="browser")
		 public void login(String browser)
		  {
			  System.out.println("************"+browser);
			  if(browser.equalsIgnoreCase("Chrome"))
			  {
				  System.setProperty("webdriver.chrome.driver", ".//MyDrivers//chromedriver.exe");
				  driver=new ChromeDriver();
			  }
			  
			  else if(browser.equalsIgnoreCase("Firefox"))
			  {
				  System.setProperty("webdriver.gecko.driver", ".//MyDrivers//geckodriver.exe");
				  driver=new FirefoxDriver();
				  
			  }
			  
		
	}
	
	@Test(priority=2)
	public void Funda() throws InterruptedException, IOException
	{
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		LoginPage lp =PageFactory.initElements(driver, LoginPage.class);
		
		lp.setusername("Username");		
		lp.setpassword("Password");
		Thread.sleep(1000);
		Thread.sleep(1000);
		scrolldown();
//		JavascriptExecutor  js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		lp.clicksex();
		String Tile =driver.getTitle(); 
		System.out.println("************************"+Tile);
		
	//	lp.LogIn_Action("username");Thread.sleep(5000);
		
	
	
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File Dest =new File("D:\\screenshot\\q.png");
		FileUtils.copyFile(scrFile, Dest);
		
	}
	@Test(priority=1)
	public void print()
	{
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		//System.out.println("*************");
	}
	
		
	@AfterMethod
	public void quitBrowser()
	{
		driver.quit();
	}

	
	

}
