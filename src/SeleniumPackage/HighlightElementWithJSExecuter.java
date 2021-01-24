package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElementWithJSExecuter {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\JAVA_PROJECTS\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe\\\\\\\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.softwaretestingmaterial.com/highlight-element-using-selenium/");
		WebElement element = driver.findElement(By.xpath("//h1"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow ; border:2px solid red;')", element);
		
	}

}
