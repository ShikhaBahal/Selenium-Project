package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import SeleniumPackage.MyCRM;

public class PropertiesFile 

{
	
	static Properties prop = new Properties();
	
	
	// main() function declaration to call functions
	
	public static void main(String args[]) 
	{
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}
	
	
	// readPropertiesFile() function declaration
	
	public static void readPropertiesFile()
	{
		
		try {
			InputStream input = new FileInputStream("C:\\Users\\Shikha Bahal\\eclipse-workspace\\SeleniumProject\\src\\config\\config.properties");
		    prop.load(input);
		    //System.out.println(prop.getProperty("browser"));
		    MyCRM.browser = prop.getProperty("browser");
		    System.out.println(MyCRM.browser);
		    
		    } 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	// writePropertiesFile() function declaration
	
	
	public static void writePropertiesFile()
	{
		try 
		{
			OutputStream output = new FileOutputStream("C:\\\\Users\\\\Shikha Bahal\\\\eclipse-workspace\\\\SeleniumProject\\\\src\\\\config\\\\config.properties");
			prop.setProperty("browser", "Chrome");
			prop.store(output, null);
			//System.out.println(prop.setProperty("browser", "Chrome"));
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		 
	}
	
	
	
	

}
