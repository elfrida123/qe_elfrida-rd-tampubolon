package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.PenambahanScreen;

public class penambahanSteps {
    @Steps
    PenambahanScreen penambahanScreen;

    @Given("user on calculator page")
    public void onCalculatorPage(){
        penambahanScreen.isOnCalculatorPageAdd();
    }

    @When("user click the first number")
    public void clickNumberFirst(){
        penambahanScreen.clickNumberFirst();
    }

    @And("user click the add operation")
    public void clickAddOperation(){
        penambahanScreen.clickAddOperation();
    }

    @And("user click the second number")
    public void clickNumberSecond(){
        penambahanScreen.clickNumberSecond();
    }

    @And("user click equal to operation")
    public void clickEqualOperationAdd(){
        penambahanScreen.clickEqualOperationAdd();
    }

    @Then("user get the result")
    public void getResultAdd(){
        penambahanScreen.getResultAdd();
    }
}
