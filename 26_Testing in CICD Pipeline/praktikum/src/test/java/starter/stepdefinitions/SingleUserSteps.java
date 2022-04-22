package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetSingleUser;

public class SingleUserSteps {
    @Steps
    GetSingleUser getSingleUser;

    @Given("I set GET api endpoints for single user")
    public void setGetApiEndpoints(){
        getSingleUser.setApiEndpoints();
    }

    @When("I send GET HTTP Request single user")
    public void sendGetHttpRequest(){
        getSingleUser.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200 single user")
    public void receiveValidHttpResponse(){
        getSingleUser.validateHttpResponseCode200();
    }

    @And("I receive valid data for detail single user")
    public void receiveValidDataForUser(){
        getSingleUser.validateDataDetailUser();
    }
}
