package Run;

import org.testng.annotations.Test;

public class groups {
  
	@Test (groups= {"smoke"})
  public void f() {
		System.out.println("smoke test with f");
  }
	@Test(groups= {"Adhoc", "Regression"})
  public void f2() {
		System.out.println("Adhoc or regression test with f2");
  }
	@Test(groups= {"Regression"})
  public void f3() {
		System.out.println("Regression test with f3");
  }
	@Test(groups= {"Adhoc"})
  public void f4() {
		System.out.println("Adhoc test with f4");
  }
	@Test(groups= {"Smoke", "Adhoc"})
  public void f5() {
		System.out.println("Smoke or Adhoc test with f5");
  }
}
