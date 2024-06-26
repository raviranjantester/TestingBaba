package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.Baselibrary;

public class TextBoxPage extends Baselibrary {
	
	public TextBoxPage()
	{
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath = "//a[text()='text box']")
	private WebElement textbox;
	
	@FindBy(xpath = "//input[@id='fullname1']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@id='fullemail1']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@id='fulladdresh1']")
	private WebElement cadd;
	
	@FindBy(xpath = "//textarea[@id=\"paddresh1\"]")
	private WebElement padd;
	
	@FindBy(xpath = "//input[@value=\"Submit\"]")
	private WebElement save;
	
	@FindBy(xpath = "// div [@class ='col-md-6 mt-5']/label")
	private List<WebElement> list;
	
	
	public void clickonclose()
	{ try {
		Thread.sleep(500);
		close.click();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	public void clickonpractice()
	{
		practice.click();
	}
	
	public void clickonelement()
	{ 
		try {
			Thread.sleep(500);
			element.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void clickontextBox()
	{
		textbox.click();
	}
	
	public void filldetails()
	{
		name.sendKeys(getReadData(0, 1, 0));
		email.sendKeys(getReadData(0, 1, 1));
		cadd.sendKeys(getReadData(0, 1, 2));
		padd.sendKeys(getReadData(0, 1, 03));
		save.click();
	}
     public void validate()
     {
    	 SoftAssert assertt = new SoftAssert();
    	 ArrayList<String> expected = new ArrayList<String>();
    	 ArrayList<String> actual = new ArrayList<String>();
    	 for(int i=0; i<4; i++)
    	 {
    		 expected.add(getReadData(0, 1, i));
    	 }
    	 for(int i=1; i<list.size(); i=i+2)
    	 {
    		 String val = list.get(i).getText();
    		 actual.add(val);
    		 
    	 }
    	 for(int i=0; i<4; i++)
    	 {
    		// Assert.assertEquals(expected.get(i), actual.get(i));
    	     assertt.assertEquals(expected.get(i), actual.get(i));
    	 }
     }
}
