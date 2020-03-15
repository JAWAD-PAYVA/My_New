package Mevan_Frame.Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Information;
import PageObject.LandingPage;
import Resurces.base_Class;

public class HomePage extends base_Class{
	
	
	@Test(dataProvider="GetData")
	public void basePageNavigation(String UserName,String Name ,String LastName) throws IOException {
		
		
		
		Driver = intializeDriver();
		
		Driver.get(pro.getProperty("url"));
	
		LandingPage l = new LandingPage(Driver);
		
	    l.FirstNameFeild().sendKeys(UserName);
		Information info = new Information(Driver);
		info.FirstName().sendKeys(Name);
		info.LastName().sendKeys(LastName);
		
		
		
		
		
	}
	
	@DataProvider
	public Object[][]  GetData() {
		
		
		Object[][] Data = new Object[2][3];
		
		Data [0][0] = "kalbi";
		Data [0][1] ="JAWAD";
		Data [0][2] = "PAYVAND";
		
		
		Data [1][0] = "ahmadjan";
		Data [1][1] = "kabuli";
		Data [1][2] = "7894560"; 
		
		return Data;
		

		
	}
	
	@AfterTest
	private void aftertest() {
		
		Driver.close();
	}
	
	
	
	

}
