package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Information {
	
	
	
	
	public WebDriver Driver;
	
	
	By NAME =By.xpath("//input[contains(@aria-label,'First name')]");
	By LastNAME =By.xpath("//input[contains(@aria-label,'Last name')]");
	
	public Information(WebDriver Driver) {
		
		this.Driver =Driver;
		
		
		
	}


	public WebElement FirstName() {
		
		return Driver.findElement(NAME);
		
		
	}
	
	public WebElement LastName() {
		
		
		return Driver.findElement(LastNAME);
		
		
		
		
	}
	
	
	
}
