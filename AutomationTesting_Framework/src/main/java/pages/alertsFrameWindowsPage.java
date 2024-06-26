package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class alertsFrameWindowsPage extends Baselibrary {

	public alertsFrameWindowsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[@data-target=\"#alerts\"]")
	private WebElement alertFrameWindows;
	
	@FindBy(xpath = "//a[@href=\"#tab_12\"]")
	private WebElement alert;
	
	@FindBy(xpath = "//button[@onclick=\"myalert()\"]")
	private WebElement clickme1;
	
	@FindBy(xpath = "//button[@onclick=\"aftersec5()\"]")
	private WebElement clickme2;
	
	@FindBy(xpath = "//button[@onclick=\"myconfirm()\"]")
	private WebElement clickme3;
	
	@FindBy(xpath = "//button[@onclick=\"myprompt()\"]")
	private WebElement clickme4;
	
	
	public void clickonalertsFrameWindows()
	{
		waitforclick(alertFrameWindows);
	}
	
	public void clickonalert()
	{
		waitforclick(alert);
	}
	
	public void clickonclickme1()
	{
		waitforclick(clickme1);
	}
	
	public void clickonclickme2()
	{
		waitforclick(clickme2);
	}
	
	public void clickonclickme3()
	{
		waitforclick(clickme3);
	}
	
	public void clickonclickme4()
	{
		waitforclick(clickme4);
	}
}
