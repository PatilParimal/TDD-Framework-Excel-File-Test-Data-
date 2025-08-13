package screenshot_of_Fail_TestCases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Fail_ScreenShot_BAse {
	public static WebDriver driver;
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software Testing Course\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
	}
	
	public void takeFailScreenShot(String failedtestSC) {
		try {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\parim\\eclipse-workspace\\TDD_FrameWork\\ScreenShots\\"+ failedtestSC +".png");
		FileHandler.copy(src, des);
		}
		catch(Exception e){
			e.getStackTrace();
		}
	}

}
