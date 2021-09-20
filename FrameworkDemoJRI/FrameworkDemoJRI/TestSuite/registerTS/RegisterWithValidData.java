package registerTS;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.TestBase;
import registerOR.RegisterObjects;
import subScripts.RegisterMethod;
import utility.DataProviderClass;

public class RegisterWithValidData extends TestBase implements RegisterObjects
{
	//Create DataProviderClass object
	public static DataProviderClass dp;
	//TestData Excel file stored location
	static String fileLocation=System.getProperty("user.dir")+"\\TestData\\Login.xlsx";
	//TestData Excel file SheetName
	static String sheetName="Register";

	@BeforeTest
	public void setUpMethod() throws IOException
	{
		//Open Browser
		setBrowser("Firefox");
		//Redirect to Register page
		redirectRegister();
		dp=new DataProviderClass();
		//DataProvider Setup Method which returns fileLocation,sheetName,testcaseName
		dp.setUp(fileLocation, sheetName, "RegisterWithValidData");
	}

	//@Test(dataProvider="xlsData", dataProviderClass=DataProviderClass.class,enabled=false)
	@Test(dataProvider="xlsData", dataProviderClass=DataProviderClass.class)
	public static void RegisterWithValid(String TestCaseName,String NameAccount,String Mobile,String Email,String Password,String ActionField) throws IOException, InterruptedException {

		//registerMethod called for check behaviour when valid data passed
		RegisterMethod.registerMethod(NameAccount, Mobile, Email, Password);
		captureScreenshot(sheetName);
		//Compare messages with actual generated messages
		String actCurrentUrl=driver.getCurrentUrl();
		Assert.assertEquals(actCurrentUrl, expUrl);
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
