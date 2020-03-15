package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	
	
	public WebDriver Driver;
	
	
	By FirstNAME =By.xpath("//input[contains(@data-testid,'royal_email')]");
	By checkPoint =By.xpath("//div[text()='It’s quick and easy.']");
	By checkPoint2 =By.xpath("//h2[text()='Sign Up']");
	
	public LandingPage(WebDriver Driver) {
		
		this.Driver =Driver;
		
		
		
	}


	public WebElement FirstNameFeild() {
		
		return Driver.findElement(FirstNAME);
		
		
	}
	

	public WebElement CheckPOINT() {
		
		return Driver.findElement(checkPoint);
		
		
	}
	

	public WebElement CheckPOINT2() {
		
		return Driver.findElement(checkPoint2);
		
		
	}
	
	
}
