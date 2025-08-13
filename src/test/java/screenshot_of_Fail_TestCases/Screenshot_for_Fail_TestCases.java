package screenshot_of_Fail_TestCases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class Screenshot_for_Fail_TestCases extends Fail_ScreenShot_BAse {
	@BeforeMethod
	public void setup() {
		
		initialization();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	@Test(priority = 0)
	public void test1() {
		driver.findElement(By.xpath("(//a[@href='https://www.ebay.com/b/Electronics/bn_7000259124'])[2]")).click();
		Assert.assertEquals(false, true);
	}
	@Test(priority = 1)
	public void test2() {
		driver.findElement(By.xpath("(//a[@href='https://www.ebay.com/b/Electronics/bn_7000259124'])[2]")).click();
		Assert.assertEquals(false, true);
	}
	@Test(priority = 2)
	public void test3() {
		Assert.assertEquals(false, false);
	}
	@Test(priority = 3)
	public void test4() {
		driver.findElement(By.xpath("(//a[@href='https://www.ebay.com/b/Electronics/bn_7000259124'])[2]")).click();
		Assert.assertEquals(false, false);
	}
	@Test(priority = 4)
	public void test5() {
		driver.findElement(By.xpath("(//a[@href='https://www.ebay.com/b/Electronics/bn_7000259124'])[2]")).click();
		Assert.assertEquals(false, true);
	}
	@Test(priority = 5)
	public void test6() {
		driver.findElement(By.xpath("(//a[@href='https://www.ebay.com/b/Electronics/bn_7000259124'])[2]")).click();
		Assert.assertEquals(false, true);
	}

}
