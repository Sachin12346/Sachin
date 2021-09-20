package base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import loginOR.LoginObjects;
import registerOR.RegisterObjects;

public class TestBase implements LoginObjects,RegisterObjects {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String workingDir = System.getProperty("user.dir");
	public static String userName="kulkarnims12@gmail.com";
	public static String password="735696";
	
	@Parameters("Browser")
	//Particular browser is opened 
	public static void setBrowser(String browser){
		//Firefox Browser
		if(browser.equalsIgnoreCase("Firefox")){
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			wait=new WebDriverWait(driver, 30);
		}
		//Edge Browser
		if(browser.equalsIgnoreCase("Edge")){
			// EdgeOptions options = new EdgeOptions();
			String FileLocation=workingDir+"\\Tools\\MicrosoftWebDriver.exe";
			System.setProperty("webdriver.edge.driver", FileLocation);
			driver=new EdgeDriver();
		}
		//IE Browser
		if (browser.equalsIgnoreCase("IE")) {

			String FileLocation=workingDir+"\\Tools\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", FileLocation);
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(CapabilityType.BROWSER_NAME, "InternetExplorer");
			driver=new InternetExplorerDriver(cap);
			driver.manage().window().maximize();
			wait=new WebDriverWait(driver, 20);
			

		}
		//Chrome Browser
		if(browser.equalsIgnoreCase("Chrome"))
		{
			String FileLocation=workingDir+"\\Tools\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", FileLocation);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			wait=new WebDriverWait(driver, 20);
		}
	}
	//To capture screenshot with SheetName & current Datetime 
	public static void captureScreenshot(String sheetName){
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd MM yyyy hh mm ss");
		String currentDate=df.format(date);
		//String currentDate=date.toString();

		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(screenshotFile, new File(workingDir+"\\screenshots\\"+sheetName+""+currentDate+".png"));
		}
		catch(Exception e){			
		}
	}
	//valid login credentials
	public static void loginValid()
	{
		driver.findElement(By.id(txtboxUserName)).sendKeys(userName);
		driver.findElement(By.id(txtboxPassword)).sendKeys(password);
		driver.findElement(By.id(btnSignIn)).click();
	}
	//Redirect to Signin page 
	public static void redirectLogin()
	{
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(txtboxUserName)));
	}
	//Redirect to Register page 
	public static void redirectRegister()
	{
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(txtbxName)));
	}
	

}
