package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickByActionsClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\JAVA_PROJECTS\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe\\\\\\\\");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        WebElement element = driver.findElement(By.xpath("//h4[text()='Deals Of The Day'] "));
        Actions action = new Actions(driver);
        action.doubleClick(element);
        
	}

}
