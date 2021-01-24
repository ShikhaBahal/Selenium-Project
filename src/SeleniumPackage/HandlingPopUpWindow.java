package SeleniumPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingPopUpWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Shikha Bahal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe\\\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/");
		driver.findElement(By.xpath("//a[text()='Come & Go Test']")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String ParentWindow = it.next();
		System.out.println("ParentWindow "+ParentWindow);
		String ChildWindow = it.next();
		System.out.println("ChildWindow "+ChildWindow);
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		
		
	}
	
	

}
