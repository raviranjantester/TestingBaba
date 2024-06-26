package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.TextBoxPage;

public class TextBoxTest extends Baselibrary{

	TextBoxPage ob;
	
	
	@BeforeTest
	public void getLaunchUrl() throws InterruptedException
	{
     launchUrl("chrome");
	 ob = new TextBoxPage();
	}
	
	@Test(priority = 0, groups = {"smoke", "sanity", "regression"})  
	public void clickonClose()
	{
		ob.clickonclose();
	}
	
	@Test(priority = 1, groups = {"sanity", "regression"})
	public void clickonPractice()
	{
		ob.clickonpractice();
		
	}
      
	@Test(priority = 2, groups = {"regression"})
	public void clickonElement() throws InterruptedException
	{
		Thread.sleep(500);
	    ob.clickonelement();
    }
	
	@Test(priority = 3, groups = {"regression"})
	public void clickonTextBox()
	{
		ob.clickontextBox();
	}
	
	@Test(priority = 4, groups = {"regression"})
	public void fillDetails()
	{
		ob.filldetails();
	}
	
	 @Test(priority = 5, groups = {"regression"})
	 public void getValidate()
	 {
		 ob.validate();
	 }
	
}

