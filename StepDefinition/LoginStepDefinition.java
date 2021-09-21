package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	
	WebDriver driver=null;
	
	@Given("^I login in gmail$")
	public void i_login_in_gmail() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Sachin\\Downloads\\Automation Bhuppi-setup\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	  driver.get("https://accounts.google.com/signin");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	}

	@When("^enter credentials$")
	public void enter_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("identifierId")).sendKeys("bhpndrbisht");
	    driver.findElement(By.id("identifierNext")).click();
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rulecenter");
	    driver.findElement(By.id("passwordNext")).click();
	    
	}

	@Then("^I navigate to home page$")
	public void i_navigate_to_home_page(){
	    // Write code here that turns the phrase above into concrete actions
	  
	}


}
