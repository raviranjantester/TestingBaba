package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.TextBoxPage;

public class webTableTest extends Baselibrary {
	
	webTableTest ob;
	@BeforeTest
	public void getLaunchUrl() throws InterruptedException
	{
		launchUrl("chrome");
	ob = new webTableTest();
	}
	
	@Test(priority = 0)  
	public void clickonClose()  throws InterruptedException
	{
		ob.clickonClose();
	}
	   
	@Test(priority = 1)
	public void clickonPractice()
	{
		ob.clickonPractice();
		
	}
      
	@Test(priority = 2)
	public void clickonElement()
	{
	    ob.clickonElement();
    }
	
	@Test(priority = 3)
	public void clickonwebtable()
	{
		ob.clickonwebtable();
    }
	
	@Test(priority = 4)
	public void filldetails()
	{
		ob.filldetails();
	}
	
	@Test(priority = 5)
	public void updateDetails()
	{
		ob.updateDetails();
	}
	
}
