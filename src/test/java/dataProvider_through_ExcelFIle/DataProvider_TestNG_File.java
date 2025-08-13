package dataProvider_through_ExcelFIle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_TestNG_File {
	public static WebDriver driver;
	@DataProvider(name = "testData")
	public Object[][] getData() {
		return ExcelDataProvider.testData("D:\\Study Data\\Selenium Projects\\TDD_FrameWork\\TDD_FrameWork\\Test_Data\\Book1.xlsx", "Sheet1");
		
	}
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider = "testData")
	public void click_On_CreateNewAccount(String FirstName,String LastName,String Email,String Password) {
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys(FirstName);
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys(LastName);
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys(Email);
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys(Password);
		
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		WebElement Month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		WebElement Year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
		Select d = new Select(day);
		d.selectByVisibleText("3");
		Select m = new Select(Month);
		m.selectByVisibleText("Jan");
		Select y = new Select(Year);
		y.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}
	
	@AfterMethod
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
