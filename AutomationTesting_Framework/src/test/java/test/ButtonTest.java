package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;

public class ButtonTest extends Baselibrary {

	ButtonTest ob;
	@BeforeTest
	public void getLaunchUrl() throws InterruptedException
	{
		launchUrl("chrome");
	ob = new ButtonTest();
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
	public void clickonButton()
	{
		ob.clickonButton();
	}
	
	@Test(priority = 4)
	public void clickondoubleclick()
	{
		ob.clickondoubleclick();
	}
	
	@Test(priority = 5)
	public void clickonrightclick()
	{
		ob.clickonrightclick();
	}
}
 