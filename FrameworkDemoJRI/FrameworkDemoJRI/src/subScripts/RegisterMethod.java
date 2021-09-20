package subScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.TestBase;
import registerOR.RegisterObjects;

public class RegisterMethod extends TestBase implements RegisterObjects {
	//TestData Excel file SheetName
	static String sheetName="Register";
	public static void registerMethod(String NameAccount,String Mobile,String Email,String Password) throws InterruptedException
	{
		//Register Send data
		driver.findElement(By.xpath(txtbxName)).sendKeys(NameAccount);
		Thread.sleep(1000);
		driver.findElement(By.xpath(txtbxMobile)).sendKeys(Mobile);
		Thread.sleep(1000);
		driver.findElement(By.xpath(txtbxEmail)).sendKeys(Email);
		Thread.sleep(1000);
		driver.findElement(By.xpath(txtbxPassword)).sendKeys(Password);
		Thread.sleep(1000);
		//Subscribe checkbox
		WebElement OcheckbxSubscribe=driver.findElement(By.xpath(checkbxSubscribe));
		if(OcheckbxSubscribe.isSelected())
		{
			driver.findElement(By.xpath(checkbxSubscribe)).click();
		}
		Thread.sleep(1000);
		//TermsConditions checkbox
		WebElement OcheckbxTermsConditions=driver.findElement(By.xpath(checkbxTermsConditions));
		if(OcheckbxTermsConditions.isSelected())
		{

		}
		else
		{
			driver.findElement(By.xpath(checkbxTermsConditions)).click();
		}
		Thread.sleep(1000);
		captureScreenshot(sheetName);
		driver.findElement(By.xpath(btnCreateAccount)).click();

		//Clear all values
		driver.findElement(By.xpath(txtbxName)).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(txtbxMobile)).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(txtbxEmail)).clear();
		driver.findElement(By.xpath(txtbxPassword)).clear();
		Thread.sleep(1000);
	}
	public static void invalidRegisterMethod(String NameAccount,String Mobile,String Email,String Password) throws InterruptedException
	{
		//Register method called
		registerMethod(NameAccount,Mobile,Email,Password);
		//Clear all values
		driver.findElement(By.xpath(txtbxName)).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(txtbxMobile)).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(txtbxEmail)).clear();
		driver.findElement(By.xpath(txtbxPassword)).clear();
		Thread.sleep(1000);
	}
}
