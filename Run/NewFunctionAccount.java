package Run;

import org.testng.annotations.Test;

import Codetostar.Usability;
import Pages.facebook.Forgot_Password;
import Pages.facebook.Home;

import org.testng.annotations.BeforeClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewFunctionAccount  extends Usability{

	
  @Test
  public void f() {
	  //open the facebook site and varify the log in function
	  Home ob= new Home(driver);
	  ob.emailinput("tasnuvactg@yahoo.com");
	  ob.passwordinput("trisha");
	  ob.signIn();
	  ob.emailinput("tasnuvactg1@yahoo.com");
	  ob.passwordinput("tri12");
	  ob.signIn();
	  
	 
  }
  @Test
  public void Forgotlinkforpassword() {
	  //go to facebook and varify forgot password
	  Home IT= new Home(driver);
	  IT.Forgotlink();
	  Forgot_Password ds= new Forgot_Password(driver);
	  String ForgotYourText= ds.ForgotYourAccountsText().getText();
	  System.out.println(ForgotYourText);
	  Assert.assertEquals(ForgotYourText, "Find Your Account");
	  ds.serchfield("tasnuvactg@yahoo.com");
	  
  }
  
@BeforeClass
public void beforeClass() {
	  Driver("chrome","http://facebook.com");
	  System.out.println("This annotation is BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This annotaion is AfterClass");
	  driver.close();
  }
  public void Driver (String browser, String URI) {
		if (browser.equalsIgnoreCase("Chrome")) {
			String dt= System.getProperty("user.dir");
	System.out.println("this is dt"+dt);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.get(URI);
			driver.manage().window().maximize();
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get(URI);
			driver.manage().window().maximize();
		}
  }
}

