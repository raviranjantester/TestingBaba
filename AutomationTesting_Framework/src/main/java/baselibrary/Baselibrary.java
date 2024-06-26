package baselibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import applicationUtility.ApplicationUtility;
import excelUtility.ExcelUtility;
import propertyUtility.PropertyUtility;

public class Baselibrary implements ExcelUtility, PropertyUtility, ApplicationUtility   {
	
	public static WebDriver driver = null;
    public void launchUrl(String browser) throws InterruptedException
	{
    	if(browser.equals("chrome"))
    	{
		String path ="C:\\Users\\hp\\.eclipse\\AutomationTesting_Framework\\webdriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	    driver = new ChromeDriver();
    	}
    	else if(browser.equals("firefox"))
    	{
    		String path = "C:\\Users\\hp\\.eclipse\\AutomationTesting_Framework\\webdriver\\geckodriver.exe";
    		System.setProperty("webdriver.gecko.driver", path);
    		driver = new FirefoxDriver();
    	}
    	
    	else if(browser.equals("edge"))
    	{
    		String path = "C:\\Users\\hp\\.eclipse\\AutomationTesting_Framework\\webdriver\\msedgedriver.exe";
    		System.setProperty("webdriver.msedge.driver", path);
    		driver = new EdgeDriver();
    	}
    	else {
    		System.out.println("Provide prameter for browser");
    	}
		driver.get("https://testingbaba.com/old/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='×']")).click();
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
	
	}
   @AfterTest
  public void getFlush()
 	{
	//	driver.close();
 	}
@Override
public String getReadData(int sheetno, int row, int col) {
	String path = "C:\\Users\\hp\\.eclipse\\AutomationTesting_Framework\\testData\\details.xlsx";
	String val = "";
	
	try {
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sheetno);
		val=sheet.getRow(row).getCell(col).getStringCellValue();
	} 
	catch (Exception e) {
		System.out.println("Issue in getreaddata :" + e);
		
	}
	return val;
}
@Override
public String getReadData(String key) {
	String path = "C:\\Users\\hp\\.eclipse\\AutomationTesting_Framework\\testData\\config.properties";
	String value="";
	try {
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		value = prop.getProperty(key);
	} catch (Exception e) {
		
	}
	return value;
}
@Override
public void doubleClickomElement(WebElement ele) {
	Actions act = new Actions(driver);
	act.doubleClick(ele).perform();
	
}
@Override
public void rightClickomElement(WebElement ele) {
	Actions act = new Actions(driver);
	act.contextClick(ele).perform();
	
}
@Override
public void waitforclick(WebElement ele) {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
    ele.click();
}
@Override
public void waitforvisible(WebElement ele, String val) {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(ele));
	ele.sendKeys(val);
}
@Override
public void waitforalert() {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.alertIsPresent());
	
}
@Override
public void switchtotab(int index) {
	Set<String> handle = driver.getWindowHandles();
         ArrayList<String> listofHandles = new ArrayList<>(handle);
         driver.switchTo().window(listofHandles.get(index));
}
@Override
public void uploadfile(String path) {
	try {
		StringSelection set = new StringSelection(path);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(set, null);
		
		Robot rob = new Robot();
		rob.delay(500);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		rob.delay(500);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.delay(250);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.delay(500);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().alert().accept();		
		driver.switchTo().alert().wait(500);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("ok");
		

	} catch (Exception e) {
		System.out.println("Issue in upload file" + e);
	}
	
    }
}
