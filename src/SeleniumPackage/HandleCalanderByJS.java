package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalanderByJS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shikha Bahal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe\\\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Date = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']/following-sibling::input[@id='ctl00_mainContent_txt_Fromdate']"));
		
		String Dateval = "12-11-2020";
		JavaScriptExecuter(driver,Date,Dateval);
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']/following-sibling::input[@id='ctl00_mainContent_txt_Fromdate']")).click();
	}
	
	public static void JavaScriptExecuter(WebDriver driver,WebElement element,String DateVal) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+DateVal+"');", element);
	}

}
