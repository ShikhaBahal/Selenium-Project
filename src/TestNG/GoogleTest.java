package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeClass
	public void Setup() {
		System.out.println("BeforeClass--Setup:::::::::");
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Shikha Bahal\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe\\\\\\\\");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@BeforeMethod
	public void pre_condition() {
		System.out.println("BeforeMethod---pre_condition:::::::::");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=2,groups="Title")
	public void GetTitleTest() {
		System.out.println("Test---GetTitleTest:::::::::");
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=1,groups="Logo")
	public void GoogleLogoTest() {
		Boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println("Google Logo IsDisplay:::"+b);
	}
	
	@AfterMethod
	public void Post_Condition() {
		System.out.println("AfterMethod---post_condition:::::::::");
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void finish() {
		driver.quit();
	}
}
