package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.UploadDownloadPage;

public class UploadTest extends Baselibrary {

	UploadDownloadPage ob;
	@BeforeTest
	public void getLaunchUrl() throws InterruptedException
	{
		launchUrl("chrome");
	ob = new UploadDownloadPage();
	}
	
	@Test(priority = 2)
	public void clickonElement()
	{
	    ob.clickonelement();
	    
	}
	
	@Test(priority = 3)
	public void clickonUploadandDownload()
	{
		ob.clickonupload();
	}
	
	@Test(priority = 3)
	public void clickonchooseFile()
	{
		ob.clickonchoosefile();
	}
}
