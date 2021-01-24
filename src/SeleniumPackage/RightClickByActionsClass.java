package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickByActionsClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\JAVA_PROJECTS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=how+to+enter+in+selenium+webdriver&oq=how+to+enter+in+selenium+webdriver&aqs=chrome.0.69i59j35i39j0i67i457j0i67l2j69i60j69i61l2.8316j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement element = driver.findElement(By.xpath("//h3/span[contains(text(),'How to specify ')]"));
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
		

	}

}
