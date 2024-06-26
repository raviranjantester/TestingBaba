package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Loginpage extends Baselibrary { 
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	public void clickonclose()
	{
		close.click();
	}
	
	public void clickonpractice()
	{
		practice.click();
	}
	
	public void gettitle()
	{
		String name = driver.getTitle();
		System.out.println(name);
	}
	
	public void geturl()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}
}
