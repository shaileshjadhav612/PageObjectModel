package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.beust.jcommander.Parameter;

public class LoginPage {
	
	public WebDriver driver;
	
	 //@FindBy(how = How.XPATH, using = "//input[@name='firstname']")
	 @FindBy(name="firstname") 
	 WebElement Username;
	 
	 @FindBy(how=How.XPATH, using="//input[@name='lastname']")	 
	WebElement Password;
	 
	 @FindBy(how = How.NAME, using = "submit")
	 
	  WebElement btn_Login ;
	 
	 @FindBy(xpath="//input[@id='sex-0']")
	 WebElement radio;
	 
//	 public LoginPage(WebDriver driver)
//		{
//			this.driver=driver;
//			PageFactory.initElements(driver, this);
//		}
	 
	 
	 public void setusername(String usre) throws InterruptedException{
	 
		 Username.sendKeys(usre); 

}
  public void setpassword(String pas)
  {
	  Password.sendKeys(pas);
  }
  public void clicksex() throws InterruptedException
  {
	  radio.click();Thread.sleep(3000);
  }
  
  

  public void scrolldown()
  {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
		js.executeScript("window.scrollBy(0,500)", "");
  
  }


	  
	  
	  
  }


	
	
	
	
	
	
	
	
	
	
	
	



