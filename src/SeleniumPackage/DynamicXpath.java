package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\JAVA_PROJECTS\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe\\\\\\\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.crmnext.com/sn/app/login/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='TxtName']")).sendKeys("shikha.behal@crmnext.in");
		driver.findElement(By.id("TxtPassword")).sendKeys("Ritesh@1997");
		driver.findElement(By.xpath("//input[@name='command']")).click();
		driver.findElement(By.xpath("//*[@class='icon icon-obj9']")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//label[text()='View']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].ScrollIntoView", element);
        driver.findElement(By.xpath("//a[@title='00256436']/parent::span/parent::div/parent::div/parent::div/following-sibling::div[@value='false']/div/div/span/div/label")).click();
	//a[@title='00256436']/parent::span/parent::div/parent::div/parent::div/following-sibling::div[@value='false']/div/div/span/div/input[@name='checkbox0']

	}

}
