package subScripts;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;

import base.TestBase;
import loginOR.LoginObjects;

public  class LoginMethod extends TestBase implements LoginObjects{
	static String sheetName="Login";
	@Parameters("browser")
	public static void loginMethod(String UserName,String password) throws InterruptedException{
		//Login credentials Method
		driver.findElement(By.id(txtboxUserName)).sendKeys(UserName);
		driver.findElement(By.id(txtboxPassword)).sendKeys(password);
		captureScreenshot(sheetName);
		driver.findElement(By.id(btnSignIn)).click();
		Thread.sleep(1000);
	}

	public static void invalidLoginMethod(String UserName,String password) throws InterruptedException
	{
		//Login credentials enter in this method
		loginMethod(UserName, password);
		//Clear all values 
		driver.findElement(By.id(txtboxUserName)).clear();
		driver.findElement(By.id(txtboxPassword)).clear();
	}
}
