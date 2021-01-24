package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DependsOnMethodTest {

	WebDriver driver;
	
	@BeforeClass
	@Parameters({"url"})
	public void setup(String url) {
		System.out.println("BeforeClass of DependsOnMethodTest ");
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Shikha Bahal\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe\\\\\\\\");
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@BeforeMethod
	public void pre_condition() {
		System.out.println("BeforeMethod ::: Precondition of DependsOnMethodTest");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(priority=1,groups="LoginTest",invocationCount=2)
	@Parameters({"username","password"})
	public void LoginTest(String username , String password) {
		System.out.println("@Test(groups=Login of DependsOnMethodTest");
		driver.findElement(By.xpath("//input[@id='TxtName']")).sendKeys(username);
		String Username = driver.findElement(By.xpath("//input[@id='TxtName']")).getText();
		driver.findElement(By.xpath("//input[@id='TxtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='command']")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Assert.assertEquals(Username, username);
	}
	
	@Test(priority=2,groups="HomePage",dependsOnMethods="LoginTest")
	public void HomepageTest() {
		System.out.println("@Test(groups=HomepageTest");
        driver.findElement(By.xpath("//*[@class='icon icon-obj9']")).click();
	}
	
	@AfterMethod
	public void post_condition() {
		System.out.println("AfterMethod ::: post_condition");
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void LogoutTest() {
		System.out.println("@Test(groups=LogoutTest");
		driver.quit();
	}
	
}
