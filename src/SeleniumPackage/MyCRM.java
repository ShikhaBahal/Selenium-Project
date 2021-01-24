package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class MyCRM {
	
	public static String browser;
	static WebDriver driver;
	static WebElement Description;

	public static void main(String[] args) 
	
	{
		setbrowser();
		//PropertiesFile.readPropertiesFile();
		setbrowserconfig();
		runtest();
    }
	
	
	public static void setbrowser() 
	
	{
		browser = "Chrome";
		
	};
	
	
	
	public static void setbrowserconfig() 
	
	{
		if(browser.contains("Firefox")) 
			
		{
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shikha Bahal\\eclipse-workspace\\SeleniumProject\\lib\\GeckoDriver\\geckodriver-v0.27.0-win64\\geckodriver.exe\\");
		 System.setProperty("Webdriver.Firefox.bin", "C:\\Program Files\\Mozilla Firefox");
		 driver = new FirefoxDriver();
	    }
		
		if (browser.contains("Chrome")) 
			
		{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shikha Bahal\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		 driver = new ChromeDriver();
		}
	}
		
	
	
	public static void runtest() {
		
		driver.get("https://my.crmnext.com/sn/app/login/login"); // Opens the CRMnext application
		driver.manage().window().maximize();
        driver.findElement(By.id("TxtName")).sendKeys("shikha.behal@crmnext.in");  //Enter login id
		driver.findElement(By.id("TxtPassword")).sendKeys("Ritesh@1996"); // Enter Password
		driver.findElement(By.name("command")).click(); // Click on Login button
		
		driver.findElement(By.xpath("//*[@class='icon icon-obj363']")).click(); // Click on Timesheet
		driver.findElement(By.xpath("//span[text()='Weekly Timesheet']")).click();  //Click on weekly timesheet
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[26]/td[1]/div[1]/div[1]/span[1]/span[1]")).click(); // Click on Gold 6.0
		
		
		
		//*******************************************************************************************************************************************************************************************************************************
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[30]/td[1]/div[1]/div[1]/a[4]/div[1]")).click();
		String textInsideDescription2 = Description.getAttribute("value");

		// Check whether input field is blank
		if(textInsideDescription2.isEmpty())
		{
			 Description.sendKeys("Sanity on Temp Oracle latest build , Handling Email Syndication Client issues , Explore Rest API automation concepts , Give analysis of custom fields client issue of khan bank");
			 System.out.println("Timesheet filled successfully!!!");
		}
		
		else {
			 System.out.println("Timesheet is already filled "+textInsideDescription2);
		}
			
	}
		
		
	}




