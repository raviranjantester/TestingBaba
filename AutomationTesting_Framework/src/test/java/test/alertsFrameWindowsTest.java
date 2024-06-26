package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.UploadDownloadPage;

public class alertsFrameWindowsTest extends Baselibrary {

	alertsFrameWindowsTest ob;
	@BeforeTest
	public void getLaunchUrl() throws InterruptedException
	{
		launchUrl("chrome");
	ob = new alertsFrameWindowsTest();
	}
	
	@Test(priority = 0)  
	public void clickonClose() throws InterruptedException
	{
		ob.clickonClose();
	}
	   
	@Test(priority = 1)
	public void clickonPractice()
	{
		ob.clickonPractice();
	}
	
	@Test(priority = 2)
	public void clickonalertsFrameWindowsTest()
	{
		ob.clickonalertsFrameWindowsTest();
	}
	
	@Test(priority = 3)
	public void clickonalert()
	{
		ob.clickonalert();
	}
	
	@Test(priority = 4)
	public void clickonclickme1()
	{
		ob.clickonclickme1();
	}
	
	@Test(priority = 5)
	public void clickonclickme2()
	{
		ob.clickonclickme2();
	}
	
	@Test(priority = 6)
	
	public void clickonclickme3()
	{
		ob.clickonclickme3();
	}
	
	@Test(priority = 7)
	public void clickonclickme4()
	{
		ob.clickonclickme4();
	}
}
