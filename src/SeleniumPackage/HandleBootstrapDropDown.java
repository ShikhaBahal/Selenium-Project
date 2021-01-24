package SeleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleBootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shikha Bahal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe\\\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//button[@id='dropdownMenu2']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//button[@id='dropdownMenu2']/following-sibling::div[@class='dropdown-menu show']//button"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			String value = list.get(i).getText();
			System.out.println(value);
			if(value.equals("Another action")) {
				list.get(i).click();
				Thread.sleep(5000);
			}
		}

	}

}
