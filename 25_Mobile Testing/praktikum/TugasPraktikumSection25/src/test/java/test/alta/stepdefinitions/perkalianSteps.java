package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.PerkalianScreen;

public class perkalianSteps {
    @Steps
    PerkalianScreen perkalianScreen;

    @Given("user on calculator page for multiplication")
    public void onCalculatorPage(){
        perkalianScreen.isOnCalculatorPageMultiplication();
    }

    @When("user click the first number for multiplication")
    public void clickFirstNumber(){
        perkalianScreen.clickNumber1();
    }

    @And("user click the multiplication operator")
    public void clickDivideOperation(){
        perkalianScreen.clickMultiplicationOperation();
    }

    @And("user click the second number for multiplication")
    public void clickSecondNumber(){
        perkalianScreen.clickNumber2();
    }

    @Then("user click equal to operation for multiplication")
    public void clickEqualOperation(){
        perkalianScreen.clickEqualOperationMinus();
    }
}
