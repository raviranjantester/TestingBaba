package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class UploadDownloadPage extends Baselibrary {

	public UploadDownloadPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath = "//a[text()=\"upload and download\"]")
	private WebElement upload;
	
	@FindBy(xpath = "//label[text()=\"Select a file\"]")
	private WebElement choosefile;
	
	
	public void clickonelement()
	{
		waitforclick(element);
		
	}
	
	public void clickonupload()
	{
		waitforclick(upload);
		
	}
	
	public void clickonchoosefile()
	{
		String path = "C:\\Users\\hp\\.eclipse\\AutomationTesting_Framework\\testData\\details.xlsx";
		waitforclick(choosefile);
		uploadfile(path);
	}
	
}
