package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.CrossScreen;

public class crossSteps {
    @Steps
    CrossScreen crossScreen;

    @Given("user on calculator page for cross")
    public void onCalculatorPage(){
        crossScreen.isOnCalculatorPageCross();
    }

    @When("user click the first number for cross")
    public void clickFirstNumber(){
        crossScreen.clickFirstNumber();
    }

    @And("user click the second number for cross")
    public void clickSecondNumber(){
        crossScreen.clickSecondNumber();
    }

    @And("user click the cross operation")
    public void clickCrossOperator(){
        crossScreen.clickCrossOperation();
    }

    @Then("the number have been delete")
    public void getResult(){
        crossScreen.getResultCross();
    }
}
