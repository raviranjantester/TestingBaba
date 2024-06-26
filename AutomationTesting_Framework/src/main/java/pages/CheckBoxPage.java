package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;
import junit.framework.Assert;

public class CheckBoxPage extends Baselibrary {

	public CheckBoxPage()
	{
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath = "//a[text()='check box']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@id='myCheck']")
	private WebElement mobilecheckbox;
	
	@FindBy(xpath = "//iframe[@src='Checkbox.html']")
    private WebElement frame;
	
	@FindBy(xpath = "//h6[@id='text']")
	private WebElement mobileText;
	
	
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
	
	public void clickonCheckbox()
	{ 
		checkbox.click();
	}
	
	public void clickonmobile()
	{
		driver.switchTo().frame(frame);
		mobilecheckbox.click();
		String expected = getReadData("mobile"); 
		String actual = mobileText.getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().defaultContent();
		System.out.println("validation completed");
	}
	}
