package loginTS;

import java.io.IOException;

import loginOR.LoginObjects;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




import subScripts.LoginMethod;
import utility.DataProviderClass;
import base.TestBase;

public class LoginWithInValidData extends TestBase implements LoginObjects{

	//Create DataProviderClass object
	public static DataProviderClass dp;
	public static String actmsgBlankEmailError="";
	public String actmsgBlankPasswordError="";
	public static String actmsgInvalidErrorPassword="";
	//TestData Excel file stored location
	static String fileLocation=System.getProperty("user.dir")+"\\TestData\\Login.xlsx";
	//TestData Excel file SheetName
	static String sheetName="Login";

	 @Parameters("Browser")
	@BeforeTest
	public static void setUpMethod() throws IOException{
		//Browser open
		setBrowser("Firefox");
		//Redirect to login page
		redirectLogin();
		dp=new DataProviderClass();
		//DataProvider Setup Method which returns fileLocation,sheetName,testcaseName
		dp.setUp(fileLocation,sheetName,"LoginWithInValidData");
	}

	@Test(dataProvider="xlsData", dataProviderClass=DataProviderClass.class)
	public static void InvalidLogin(String TestCaseName,String UserName, String password,String actionField) throws InterruptedException{

		//LoginMethod call with Invalid UserName,password
		LoginMethod.invalidLoginMethod(UserName, password);

		//Compare Invalid messages with actual generated messages
		actmsgInvalidErrorPassword=driver.findElement(By.id(errorInvalidLoginPass)).getText();

		if(actionField.equalsIgnoreCase("Wrong_Credentials"))
		{
			Assert.assertEquals(actmsgInvalidErrorPassword, expmsgInvalidEmailPassword);
		}

		LoginMethod.invalidLoginMethod(UserName, password);

		actmsgBlankEmailError=driver.findElement(By.id(errorBlankEmail)).getText();
		if(actionField.equalsIgnoreCase("Blank_Credentials"))
		{
			Assert.assertEquals(actmsgBlankEmailError,expmsgBlankEmailError);
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

		driver.quit();
	}

}
