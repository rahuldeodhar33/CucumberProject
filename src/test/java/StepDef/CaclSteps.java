package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CaclSteps {
	int result;
	@Given("Open Calculator")
	public void open_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Open Calculator...");
	}

	@When("Enter two numbers {int} and {int} for add")
	public void enter_two_numbers_and_for_add(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
	    result = num1 + num2;
	}

	@Then("I should get addition as {int}")
	public void i_should_get_addition_as(int res) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(res,result);
	}

	@When("Enter two numbers {int} and {int} for substract")
	public void enter_two_numbers_and_for_substract(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
	    result = num1 - num2;
	}

	@Then("I should get substraction as {int}")
	public void i_should_get_substraction_as(int res) {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(res, result);
	}
}
