package StepDef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CalculatorSteps {
	int result=0;
	@When("Enter two numbers to add {int} and {int}")
	public void enter_two_numbers_to_add_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
	    result = num1 + num2;
	}

	@Then("I should get result as {int}")
	public void i_should_get_result_as(int res) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(result, res);
	    
	}

	@When("Enter two numbers {int} and {int}")
	public void enter_two_numbers_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
	    result = num1 + num2;
	}

	@Then("I should get result {int}")
	public void i_should_get_result(int res) {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(result, res);
	}
	@When("I add numbers")
	public void i_add_numbers(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    int rows = dataTable.height();
	    for(int rw=0;rw<rows;rw++) {
	    	
	    	result = result + Integer.parseInt(dataTable.cell(rw, 0));
	    	
	    }
	}
	@When("I add numbers using List")
	public void i_add_numbers_using_list(List<Integer> numbers) {
	    // Write code here that turns the phrase above into concrete actions
	   for (int num : numbers) {
		   result = result + num;
	   }
	}
	@When("I add menu")
	public void i_add_menu(Map<String, Integer> priceList) {
	    // Write code here that turns the phrase above into concrete actions
		for (String key:priceList.keySet()) {
			result = result + priceList.get(key);
		}
	}

	@When("I add menu with qty")
	public void i_add_menu_with_qty(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
		int rows = dataTable.height();
		for(int rw=0;rw<rows;rw++) {
			int qty = Integer.parseInt(dataTable.cell(rw, 1));
			int prx = Integer.parseInt(dataTable.cell(rw, 2));
	    	result = result + qty * prx;
	    	//(Integer.parseInt(dataTable.cell(rw, 1)) ---> to get the qty
	    	//(Integer.parseInt(dataTable.cell(rw, 2)) ---> to get the price
	    }
	}

}
