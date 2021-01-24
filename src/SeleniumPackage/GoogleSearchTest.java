package SeleniumPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\JAVA_PROJECTS\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe\\\\\\\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Robot rb = new Robot();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java");
		rb.keyPress(KeyEvent.VK_ENTER);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe' and @role='listbox']//li//descendant::div[@class='sbl1']/span"));
		System.out.println("Size of List::"+list.size());
		
	}

}
