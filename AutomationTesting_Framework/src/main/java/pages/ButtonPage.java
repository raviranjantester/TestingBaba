package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class ButtonPage extends Baselibrary  {

	public ButtonPage()
	{
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath = "//a[text()='buttons']")
	private WebElement button;
	
	@FindBy(xpath = "//button[@ondblclick='doubletext()']")
	private WebElement doubleclick;
	
	@FindBy(xpath = "//button[@oncontextmenu='righttext()']")
	private WebElement rightclick;
	
	
	public void clickonclose()
	{
		close.click();
	}
	
	public void clickonpractice()
	{
		practice.click();
	}
	
	public void clickonelement() 
	{
		element.click();
	}
	
	public void clickDoubleonElement()
	{
		doubleClickomElement(doubleclick);
	}
	
	public void clickrightonElement()
	{
		rightClickomElement(rightclick);
	}
}
