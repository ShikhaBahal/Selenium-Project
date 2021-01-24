package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {

	 @BeforeSuite  
	 public void before_suite()  
	 {  
	     System.out.println("before_suite");  
	 }  
	 
	 @BeforeTest
	 public void before_test() {
		 System.out.println("before_test");   
	 }
	 
	 @BeforeClass
	 public void before_class() {
		 System.out.println("before_class");  
	 }
	 
	 @BeforeMethod
	 public void before_method() {
		 System.out.println("before_method");  
	 }
	 
	 @Test
	 public void test1() {
		 System.out.println("-1 Priority");  
	 }
	 
	 @Test(priority=1)
	 public void test2() {
		 System.out.println("1 Priority"); 
	 }
	 
	 @Test
	 public void test3() {
		 System.out.println(" Priority"); 
	 }
	 
	 
	 @AfterMethod
	 public void after_method() {
		 System.out.println("after_method"); 
	 }
	 
	 @AfterClass
	 public void after_class() {
		 System.out.println("after_class");  
	 }
	 
	 @AfterTest
	 public void after_test() {
		 System.out.println("after_test"); 
	 }
	 
	 @AfterSuite
	 public void after_suite(){
		 System.out.println("after_suite"); 
	 }
}
