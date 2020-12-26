package Run;

import org.testng.annotations.Test;

import Codetostar.Usability;
import Pages.facebook.Home;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Functions extends Usability {


  @Test
  public void f() {
	  
	  
	  Home ob= new Home(driver);
	  ob.emailinput("tasnuvactg@yahoo.com");
	  ob.passwordinput("trisha");
	  ob.signIn();
	  ob.emailinput("tasnuvactg1@yahoo.com");
	  ob.passwordinput("tri12");
	  ob.signIn();
  }
 /* @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
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
		}*/
}
