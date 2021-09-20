package loginTS;

import java.io.IOException;

import loginOR.LoginObjects;
import subScripts.LoginMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import base.TestBase;

import utility.DataProviderClass;

public class LoginWithValidData extends TestBase implements LoginObjects{

	//Create DataProviderClass object
	public static DataProviderClass dp;
	//TestData Excel file stored location
	static String fileLocation=System.getProperty("user.dir")+"\\TestData\\Login.xlsx";
	//TestData Excel file SheetName
	static String sheetName="Login";
	@Parameters("Browser")
	@BeforeTest
	public static void setUpMethod() throws IOException{
		
		//Browser open
		setBrowser("chrome");
		//Redirect to login page
		String test1 = "Hi";
		System.out.println(test1);
		redirectLogin();
		dp=new DataProviderClass();
		
		//DataProvider Setup Method which returns fileLocation,sheetName,testcaseName
		dp.setUp(fileLocation,sheetName,"LoginWithValidData");
	}

	@Test(dataProvider="xlsData", dataProviderClass=DataProviderClass.class)
	public static void LoginWithValid(String TestCaseName,String UserName, String password,String actionField) throws InterruptedException{

		//LoginMethod call with UserName,password 
		LoginMethod.loginMethod(UserName, password);
		
		//Compare URL
		String expHomePage="https://www.justrechargeit.com/myaccount_directory.aspx";
		String actHomePage=driver.getCurrentUrl();
		//As per actionField it goes to particular block of code
		if(actionField.equals("Correct_Credentials"))
		{
			//Validate login successfully or not 
			Assert.assertEquals(actHomePage, expHomePage);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(linksignOut)));
			//Screenshot capture
			captureScreenshot(sheetName);
			Thread.sleep(5000);
			driver.findElement(By.id(linksignOut)).click();
			driver.get("https://www.justrechargeit.com/SignIn.aspx");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(txtboxUserName)));
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
