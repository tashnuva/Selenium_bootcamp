import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Expedia1 {
	static WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void f() {
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/div/li[1]/a/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div/div[1]/div/div[1]/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin\"]")).sendKeys("iad");
		driver.findElement(
				By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/ul/li[1]/button/div/div[1]/span/strong"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination\"]")).sendKeys("bangladesh");
		driver.findElement(By.xpath(
				"//*[@id=\"location-field-leg1-destination-menu\"]/div[2]/ul/li[1]/button/div/div[1]/span/strong"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("(//*[@data-day='27'])[1]")).click();
		driver.findElement(By.xpath("(//*[@data-day='27'])[2]")).click();
		driver.findElement(By.xpath("(//*[text()='Done'])[2]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(
				"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[2]/div[2]/div[1]/section[1]/main[1]/ol[1]/li[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(
				"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[2]/div[2]/div[1]/section[1]/main[1]/ol[1]/li[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		// Store the current window handle
		@SuppressWarnings("unused")
		String winHandleBefore = driver.getWindowHandle();
		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.findElement(
				By.xpath("//*[@id=\"app-layer-base\"]/div/div/div[2]/div/main/section[2]/div[1]/div/div[2]/button"))
				.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("firstname[0]")).sendKeys("tashnuva");
		driver.findElement(By.id("lastname[0]")).sendKeys("zaman");
		driver.findElement(By.id("phone-number[0]")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"preferences\"]/form/fieldset/fieldset/div/fieldset[2]/label[2]/span"))
				.click();

	}

	@AfterMethod
	public void afterMethod() {
	  	  System.out.println("Closing the browser session");
	  	  driver.quit();

	}

}
