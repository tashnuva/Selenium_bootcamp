package bootcamp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;


public class homedepot {
	static WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
	  
	  }
 
  @Test
  @Parameters({ "email", "password", "zipcode","phoneno" })
  public void newAccount(String email, String password, String zipcode, String phoneno) {
	  driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"headerMyAccountTitle\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"SPSORegister\"]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"single-signin__body\"]/div/div[2]/form/div[2]/div[1]/button/div/div/div[1]/p[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"single-signin__body\"]/div/div[2]/form/div[3]/div/button/span")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password-input-field")).sendKeys(password);
		driver.findElement(By.id("zipCode")).sendKeys(zipcode);
		driver.findElement(By.id("phone")).sendKeys(phoneno);
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"single-signin__body\"]/div/div[2]/form/button/span")).click();
		
  }


  @AfterMethod
  public void afterMethod() {
  }



}
