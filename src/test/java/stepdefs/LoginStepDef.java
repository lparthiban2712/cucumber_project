package stepdefs;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import org.testng.Assert;

public class LoginStepDef {
	WebDriver driver=Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		   
	}

	@When("I enter the correct username and passowrd")
	public void i_enter_the_correct_username_and_passowrd() {
	    // Write code here that turns the phrase above into concrete actions
	   	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("I enter the incorrect username and passowrd")
	public void i_enter_the_incorrect_username_and_passowrd() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement email=driver.findElement(By.name("user_login"));
		email.sendKeys("jhgjhgj");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("lkjlkjkljklj");

	}
	
	@When("I enter the username as {string} and password as {string}")
	public void i_enter_the_username_as_and_passowrd_as(String usernamevalue, String passwordvalue) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement email=driver.findElement(By.name("user_login"));
		email.sendKeys(usernamevalue);
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(passwordvalue);

	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpectedError) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement error=driver.findElement(By.id("error_box"));

		String ActualError=error.getText();
		if(ExpectedError.equals(ActualError))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println(" TC is failed");	;
		}
		
		
		

	}
	
	

	@And("I click on Login link")
	public void i_click_on_Login_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Log in")).click();
	    	}
	

	@And("I click on Login button")
	public void i_click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement login=driver.findElement(By.cssSelector("[name=btn_login]"));
		login.click();

	    	}

}
