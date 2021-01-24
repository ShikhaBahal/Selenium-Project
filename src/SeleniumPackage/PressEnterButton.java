package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PressEnterButton {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\JAVA_PROJECTS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sss")));
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
        element.sendKeys("Test");
        element.submit();
		
	}

}
