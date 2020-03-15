package Resurces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_Class {

	
	public Properties pro;
	public WebDriver Driver;
	
	public WebDriver intializeDriver() throws IOException {
		
		
		
	    pro = new Properties();
		FileInputStream Fis = new FileInputStream("C:\\Users\\Ahmad\\OneDrive\\Desktop\\AJ SELENUIM\\Academy\\src\\main\\java\\Resurces\\Data.properties");
		
		pro.load(Fis);
	    String browserName = pro.getProperty("browser");
	    
	
		if(browserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmad\\OneDrive\\Desktop\\AJ SELENUIM\\Academy\\Driver\\chromedriver.exe");
			
			Driver = new ChromeDriver();
			
			Driver.manage().window().maximize();			
			
		}else if (browserName.equals("Firefox")) {
			

			
		}
		
		
		
		return Driver;
		
	}
	
	
	
	
}
