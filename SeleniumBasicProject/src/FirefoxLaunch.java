import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirefoxLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Sachin\\Downloads\\Automation Bhuppi-setup\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://accounts.google.com/signin");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("identifierId")).sendKeys("bhpndbisht");
driver.findElement(By.id("identifierNext")).click();
WebElement passwordButton= driver.findElement(By.xpath("//input[@name='password']"));
WebDriverWait wait =new WebDriverWait(driver,30);
wait.until(ExpectedConditions.elementToBeClickable(passwordButton));
passwordButton.sendKeys("rulecenter");
driver.findElement(By.id("passwordNext")).click();
driver.quit();

	}

}
