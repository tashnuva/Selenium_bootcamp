package Codetostar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Usability {
	
public WebDriver driver;
@Parameters({"browser","URI"})
  
  @BeforeClass
  
  public void beforeClass1(String browser, String sites) {
		if (browser.equalsIgnoreCase("Chrome")) {
			String dt= System.getProperty("user.dir");
	System.out.println("this is dt"+dt);
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.get(sites);
			driver.manage().window().maximize();
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get(sites);
			driver.manage().window().maximize();
		}
}
  public void beforeClass(String browser, String sites) {
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  public void Driver (String browser, String URI) {
		if (browser.equalsIgnoreCase("Chrome")) {
			String dt= System.getProperty("user.dir");
	System.out.println("this is dt"+dt);
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe" );
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
