package starter.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.bookstore.Get;

public class BookStoreSteps {
    @Steps
    Get get;

    @Given("I set GET api endpoints for account")
    public void setGetApiEndpoints(){
        get.setApiEndpoints();
    }

    @When("I send GET HTTP request for account")
    public void sendGetHttpRequest(){
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200 for account")
    public void receiveValidHttpResponse(){
        get.validateHttpResponseCode200();
    }

//
//    @Given("I set POST api endpoints")
//    public void setPostApiEndpoints(){
//    }
//
//    @When("I send POST HTTP request")
//    public void sendPostHttpRequest(){
//    }
//
//    @Then("I receive valid HTTP response code 201")
//    public void receiveValidHttpResponsePost(){
//    }
}
