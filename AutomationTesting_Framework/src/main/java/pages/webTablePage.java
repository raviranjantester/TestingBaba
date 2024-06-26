package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class webTablePage extends Baselibrary{
	
	public webTablePage()
	{
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath = "//a[@href='#tab_4']")
	private WebElement webtable;
	
	@FindBy(xpath = "//input[@pattern='^[a-zA-Z][\\sa-zA-Z]{2,32}']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$']")
	private WebElement email;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;
	
	@FindBy(xpath = "//iframe[@src='Webtable.html']")
	private WebElement frame;
	
	@FindBy(xpath = "//button[text()='Edit']")
	private List<WebElement> edit;
	
	@FindBy(xpath = "//input[@name='edit_name']")
	private WebElement editname;
	
	@FindBy(xpath = "//input[@name='edit_email']")
	private WebElement editemail;
	
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement update;
	
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
	
	public void clickonwebtable()
	{
		webtable.click();
	}
	
	public void fillDetails()
	{
		driver.switchTo().frame(frame);
	   for(int i=1; i<=3; i++)
	   {
	name.sendKeys(getReadData(1, 1, 0));
	email.sendKeys(getReadData(1, 1, 1));
	save.click();
	   }
	   driver.switchTo().defaultContent(); 
	}
	
	public void updatedetails()
	{
		int i=1;
		driver.switchTo().frame(frame);
		for(WebElement ele: edit)
		{
			edit.get(i).click();
			editname.clear();
			editname.sendKeys(getReadData(2, i, 0));
			editemail.clear();
			editemail.sendKeys(getReadData(2, i, 1));
		    update.click();
		    i++;
		}
		driver.switchTo().defaultContent();
	}
}
