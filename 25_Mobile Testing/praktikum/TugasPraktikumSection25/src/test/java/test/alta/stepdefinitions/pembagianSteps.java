package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.PembagianScreen;

public class pembagianSteps {
    @Steps
    PembagianScreen pembagianScreen;

    @Given("user on calculator page for divide")
    public void onCalculatorPage(){
        pembagianScreen.isOnCalculatorPage();
    }

    @When("user click the first number for divide")
    public void clickFirstNumber(){
        pembagianScreen.clickFirstNumber();
    }

    @And("user click the divide operation")
    public void clickDivideOperation(){
        pembagianScreen.clickDivideOperation();
    }

    @And("user click the second number for divide")
    public void clickSecondNumber(){
        pembagianScreen.clickSecondNumber();
    }

    @And("user click equal to operation for divide")
    public void clickEqualOperation(){
        pembagianScreen.clickEqualOperation();
    }

    @Then("user get the result for divide")
    public void getResult(){
        pembagianScreen.getResult();
    }
}
