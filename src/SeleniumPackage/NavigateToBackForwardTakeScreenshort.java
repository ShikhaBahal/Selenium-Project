package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToBackForwardTakeScreenshort {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Shikha Bahal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe\\\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Ritesh Aidasani");
		driver.findElement(By.xpath("//input[@name='q']")).submit();
	
	}

}
