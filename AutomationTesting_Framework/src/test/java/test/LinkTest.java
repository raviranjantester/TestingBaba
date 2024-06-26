package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;

public class LinkTest extends Baselibrary {
	
	LinkTest ob;
	@BeforeTest
	public void getLaunchUrl() throws InterruptedException
	{
		launchUrl("chrome");
	ob = new LinkTest();
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
	public void clickonlink()
	{
		ob.clickonlink();
		
	}
	
	@Test(priority = 4)
	public void clickondemopage()
	{
		ob.clickondemopage();
		
	}
}
