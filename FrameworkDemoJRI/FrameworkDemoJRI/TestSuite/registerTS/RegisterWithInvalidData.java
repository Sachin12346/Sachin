package registerTS;

import org.testng.annotations.Test;
import base.TestBase;
import registerOR.RegisterObjects;
import subScripts.RegisterMethod;
import utility.DataProviderClass;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class RegisterWithInvalidData extends TestBase implements RegisterObjects{
	//Create DataProviderClass object
	public static DataProviderClass dp;
	//TestData Excel file stored location
	static String fileLocation=System.getProperty("user.dir")+"\\TestData\\Login.xlsx";
	//TestData Excel file SheetName
	static String sheetName="Register";

	@BeforeTest
	public void setUpMethod() throws IOException
	{
		//Browser open
		setBrowser("IE");
		//Redirect to Register page
		redirectRegister();		
		dp=new DataProviderClass();
		//DataProvider Setup Method which returns fileLocation,sheetName,testcaseName
		dp.setUp(fileLocation, sheetName, "RegisterWithInValidData");
	}

	//@Test(dataProvider="xlsData", dataProviderClass=DataProviderClass.class,enabled=false)
	@Test(dataProvider="xlsData", dataProviderClass=DataProviderClass.class)
	public static void RegisterWithInValid(String TestCaseName,String NameAccount,String Mobile,String Email,String Password,String ActionField) throws InterruptedException {
		
		//invalidRegisterMethod called for check behaviour when invalid data passed
		RegisterMethod.invalidRegisterMethod(NameAccount, Mobile, Email, Password);

		//Variable declarations for message
		String actmsgBlankName="";
		String actmsgBlankPassword="";
		String actmsgInvalidMobile="";
		String actmsgInvalidEmail="";

		//Compare Invalid messages with actual generated messages
		if(ActionField.equalsIgnoreCase("Invalid_Email"))
		{
			actmsgInvalidEmail=driver.findElement(By.xpath(errorBlankEmail)).getText();	
			Assert.assertEquals(actmsgInvalidEmail, expmsgRegisterBlankEmail);
		}
		else if(ActionField.equalsIgnoreCase("Invalid_Mobile")){
			actmsgInvalidMobile=driver.findElement(By.xpath(errorRegisterBlankMobile)).getText();	
			Assert.assertEquals(actmsgInvalidMobile, expmsgRegisterBlankMobile);
		}
		else if(ActionField.equalsIgnoreCase("Invalid_Name"))
		{
			actmsgBlankName=driver.findElement(By.xpath(errorRegisterBlankName)).getText();	
			Assert.assertEquals(actmsgBlankName, expmsgRegisterBlankName);
		}
		else if(ActionField.equalsIgnoreCase("Invalid_Password"))
		{
			actmsgBlankPassword=driver.findElement(By.xpath(errorRegisterBlankPassword)).getText();	
			Assert.assertEquals(actmsgBlankPassword, expmsgRegisterBlankPassword);
		}
	}
	@AfterMethod  //this is optional
	public void screenshot(){
		//Screenshot capture
		captureScreenshot(sheetName);
	}
	@AfterTest
	public void tearDown(){
		//driver close method

		driver.close();
	}
}
