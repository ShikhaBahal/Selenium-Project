package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\\\\\\\\\\\\\\\JAVA_PROJECTS\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe\\\\\\\\\\\\\\\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.crmnext.com/sn/app/login/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='TxtName']")).sendKeys("shikha.behal@crmnext.in");
		driver.findElement(By.id("TxtPassword")).sendKeys("Ritesh@1997");
		driver.findElement(By.xpath("//input[@name='command']")).click();
		driver.findElement(By.xpath("//*[@class='icon icon-obj9']")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@title,'00235658')]/parent::span/parent::div/parent::div[@class='react-grid-Cell__value']/parent::div/following-sibling::div[@class='react-grid-Cell react-grid-Cell--frozen rdg-last--frozen']/div/div/span/div/label")).click();
		
		
	}

}
