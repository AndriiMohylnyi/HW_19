package DefSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CalculatorStepsDef {
    private Calculator calc;

    int a;
    int b;
    int result;

    @Given("two numbers {int} and {int}")
    public void two_numbers_and(int a, int b) {

        this.a = a;
        this.b = b;
        this.calc = new Calculator();
    }

    @When("try to find sum of two numbers")
    public void we_try_to_find_sum_of_our_numbers() {
        result = calc.sum(a, b);
    }

    @Then("sum result should be {int}")
    public void sum_result_should_be(int resultSum) {
        Assert.assertEquals(resultSum, result, 0.0001);
    }

    @When("try to find mult of two numbers")
    public void we_try_to_find_mult_of_two_numbers() {
        result = calc.mult(a, b);
    }

    @Then("mult result should be {int}")
    public void result_should_be(int resultMult) {
        Assert.assertEquals(resultMult, result, 0.0001);
        ;
    }
}
