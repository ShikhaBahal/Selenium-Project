package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shikha Bahal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe\\\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("shikha.crmnext@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Acid@#12");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Calendar']")).click();

	}

}
