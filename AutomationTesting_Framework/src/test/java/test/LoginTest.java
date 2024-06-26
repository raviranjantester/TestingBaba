package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Loginpage;

public class LoginTest extends Baselibrary {

	Loginpage ob;
	@BeforeTest
	public void getLaunchUrl() throws InterruptedException
	{
		launchUrl("chrome");
	    ob = new Loginpage();
	}
	
	@Test
	public void clickonClose()  
	{
		ob.clickonclose();
	}
	@Test
	public void clickonPractice()
	{
		ob.clickonpractice();
	}
	@Test
	public void getTitloftepage()
	{
		ob.gettitle();
	}
	@Test
	public void getUrl()
	{
		ob.geturl();
	}
	
}
