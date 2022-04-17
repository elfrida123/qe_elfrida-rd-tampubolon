package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.PenguranganScreen;

public class penguranganSteps {
    @Steps
    PenguranganScreen penguranganScreen;

    @Given("user on calculator page for minus")
    public void onCalculatorPageMinus(){
        penguranganScreen.isOnCalculatorPageMinus();
    }

    @When("user click the first number for minus")
    public void clickNumber1(){
        penguranganScreen.clickNumber1();
    }

    @And("user click the minus operation")
    public void clickMinusOperation(){
        penguranganScreen.clickMinusOperation();
    }

    @And("user click the second number for minus")
    public void clickNumber2(){
        penguranganScreen.clickNumber2();
    }

    @And("user click equal to operation for minus")
    public void clickEqualOperationMinus(){
        penguranganScreen.clickEqualOperationMinus();
    }

    @Then("user get the result for minus")
    public void getResultMinus(){
        penguranganScreen.getResultMinus();
    }
}
