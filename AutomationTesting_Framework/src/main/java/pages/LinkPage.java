package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class LinkPage extends Baselibrary {
	
	public LinkPage()
	{
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath = "//a[text()=\"links\"]")
	private WebElement link;
	
	@FindBy(xpath = "//a[text()=\"Demo Page\"]")
	private WebElement demopage;
	
	public void clickonclose() throws InterruptedException
	{
		waitforclick(close);
		 
	}
	
	public void clickonpractice()
	{
		waitforclick(practice);
		
	}
	
	public void clickonelement()
	{
		waitforclick(element);
		
	}
	
	public void clickonlinks()
	{
		waitforclick(link);
		
	}
	
	public void clickondemopage()
	{
		waitforclick(demopage);
		switchtotab(1);
		waitforclick(close);
	}
}
