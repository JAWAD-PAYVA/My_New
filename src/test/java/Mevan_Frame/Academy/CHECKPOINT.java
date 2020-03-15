package Mevan_Frame.Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Information;
import PageObject.LandingPage;
import Resurces.base_Class;

public class CHECKPOINT extends base_Class{
	
	
	@Test
	public void basePageNavigation() throws IOException {
		
		Driver = intializeDriver();
		
		Driver.get(pro.getProperty("url"));
	
		LandingPage l = new LandingPage(Driver);
		
		Assert.assertEquals(l.CheckPOINT().getText(), "It’s quick and easy.");
		
		String Checkpointtt = l.CheckPOINT2().getText();
		
		if(Checkpointtt.contains(Checkpointtt)) {
			
			
			Assert.assertTrue(true);
			System.out.println("The test is passed ");
			
			
		}else{

			System.out.println("The test is falild");
			
			
		}
		

		
		
	}
	@AfterTest
	private void aftertest() {
		
		Driver.close();
	}
	

	
	
	

}
