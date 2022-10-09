package stepdefs;



import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefs {
	
	int result=0;
	
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I add {int} and {int}")
	public void i_add_and(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    result=int1+int2;
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		
	 if(int1==result)
	 {
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Assert.assertTrue(false);
	 }
	}
	
	@When("I add below numbers")
	public void i_add_below_number(List<Integer> numbers) 
	{
		for(Integer num:numbers)
		{
			result=result+num;
		}

	}

}
