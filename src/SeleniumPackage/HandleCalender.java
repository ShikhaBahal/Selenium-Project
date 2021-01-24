package SeleniumPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalender {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shikha Bahal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe\\\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hrms.crmnext.net/hrms/login.aspx");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@name='userIdText']")).sendKeys("shikha.behal@crmnext.in");
		driver.findElement(By.id("passwordText")).sendKeys("Bahal@12");
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='ctl00_Header1_lnkOD']")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		String ParentWindow = it.next();
		System.out.println("ParentWindow::"+ParentWindow);
		
		String ChildWindow = it.next();
		System.out.println("ChildWindow::"+ChildWindow);
		driver.switchTo().window(ChildWindow);
		System.out.println("Child Window Title::"+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='ctl00_ContentSection_dpFrom_dateTextBox']")).click();
		
		String Date = "20-Oct-2020";
		String D[] = Date.split("-");
		String Day = D[0];
		String Month = D[1];
		String Year = D[2];
		System.out.println(Day);
		System.out.println(Month);
		System.out.println(Year);
	    //Boolean Flag=false;
		
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		SelectValueFromDropdown(month,Month);
		System.out.println("Month Dropdown selected");
//		SelectValueFromDropdown(year,Year);
//		System.out.println("Year Drop-down selected");
		
		String BeforeXpath = "//tbody/tr[";
		String AfterXpath = "]/td[";
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=7;j++) {
				String Value = driver.findElement(By.xpath(BeforeXpath+i+AfterXpath+j+"]")).getText();
				System.out.println(Value);
				if(Value.equals(Day)) {
					driver.findElement(By.xpath(BeforeXpath+i+AfterXpath+j+"]")).click();
				}
				
			}
		}
	}

	public static void SelectValueFromDropdown(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
			
	}
}
