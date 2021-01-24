package SeleniumPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ReadProperties {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream io = new FileInputStream("C:\\Users\\Shikha Bahal\\eclipse-workspace\\SeleniumProject\\src\\SeleniumPackage\\config.properties");
		prop.load(io);
		String Browser = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		System.out.println(Browser);
		System.out.println(URL);
		
		if(Browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shikha Bahal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe\\\\");
		driver = new ChromeDriver();
		}
		
		else if(Browser.equals("FF")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shikha Bahal\\eclipse-workspace\\SeleniumProject\\lib\\GeckoDriver\\geckodriver-v0.27.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(URL);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(prop.getProperty("Accounts&Links_xpath")))).build().perform();
		driver.findElement(By.xpath(prop.getProperty("SignIn_xpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath(prop.getProperty("continue_xpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("LoginSubmit"))).click();
	}

}
