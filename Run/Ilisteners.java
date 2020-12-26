package Run;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;
import org.testng.internal.annotations.ITest;

import Codetostar.Usability;

public class Ilisteners extends Usability implements ITestListener {
public void onTestSucess (ITestResult result) {
	  // TODO Auto-generated method stub
	  //ITestListener.super.onTestSuccess(result);
	 
	System.out.println("Automation is passed");
	 
	this.driver = ((Usability)result.getInstance()).driver;
Date dt=new Date(6);
System.out.println(dt);
String si=dt.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(si);
	  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   try {
	   FileHandler.copy(shots,new File("C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Screenshots\\pictures+si.png"));
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
}
	  
	 
public void onTestFailure(ITestResult result) {
	  // TODO Auto-generated method stub
	  //ITestListener.super.onTestFailure(result);
	  this.driver = ((Usability)result.getInstance()).driver;
	  Date dt=new Date(6);
	  System.out.println(dt);
	  String si=dt.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(si);
	  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   try {
	   FileHandler.copy (shots,new File("C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Screenshots\\pictures+si.png"));
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
}
	 }