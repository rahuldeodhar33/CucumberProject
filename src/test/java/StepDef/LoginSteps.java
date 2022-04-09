package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver = BaseClass.driver;
	@Given("I have opened the application in browser")
	public void i_have_opened_the_application_in_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);
				
	}

	@When("I click on the Login link")
	public void i_click_on_the_login_link() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement LoginLink = driver.findElement(By.className("login"));	
	    LoginLink.click();
	}
	@When("I enter username")
	public void i_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("lms@gmail.com");
	}

	@When("I enter password")
	public void i_enter_password() {
	    // Write code herex that turns the phrase above into concrete actions
		WebElement Password = driver.findElement(By.name("user_pwd"));
		Password.sendKeys("Abcd@1234");
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.cssSelector("input[name=btn_login]"));
		LoginBtn.click();
	}

	@Then("I should be Landed on the home page")
	public void i_should_be_landed_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Open home page");
	}

	@When("I enter username {string}")
	public void i_enter_username(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserNameVal);
		}

	@When("I enter password {string}")
	public void i_enter_password(String PasswordVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.name("user_pwd"));
		LoginBtn.sendKeys(PasswordVal);
	}
	
	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String ExpMsg){
	    // Write code here that turns the phrase above into concrete actions
		WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		String ActualMsg = ErrorMsg.getText();
		Assert.assertEquals(ActualMsg, ExpMsg); 
	}
	
}
