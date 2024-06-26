package applicationUtility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {

	public void  doubleClickomElement(WebElement ele);
	public void  rightClickomElement(WebElement ele);
	public void waitforclick(WebElement ele);
	public void waitforvisible(WebElement ele, String val);
	public void waitforalert();
	public void switchtotab(int index);
	public void uploadfile(String path);
	
}
  