package test.alta.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.ACScreen;

public class ACSteps {
    @Steps
    ACScreen acScreen;

    @Given("user on calculator page for AC")
    public void onCalculatorPage(){
        acScreen.isOnCalculatorPage();
    }

    @When("user click the the numbers")
    public void clickTheNumbers(){
        acScreen.clickTheNumbers();
    }

    @Then("user click the AC operation")
    public void clickAcOperation(){
        acScreen.clickAcOperation();
    }
}
