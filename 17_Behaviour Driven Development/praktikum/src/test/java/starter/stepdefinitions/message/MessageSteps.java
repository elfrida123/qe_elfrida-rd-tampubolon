package starter.stepdefinitions.message;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.message.Message;

public class MessageSteps {
    @Steps
    Message message;

    @Given("I am on the message page")
    public void onTheMessagePage(){
        message.onTheMessagePage();
    }

    @Then("I search name of people that I want to message in search box")
    public void SearchPeople(){
        message.SearchPeople();
    }

    @Then("I click the name of people")
    public void ClickName(){
        message.ClickName();
    }

    @When("I write text")
    public void WriteText(){
        message.WriteText();
    }

    @And("I click Send button")
    public void ClickSendButton(){
        message.ClickSendButton();
    }

    @Then("my message have been sent")
    public void MessageSent(){

    }
}
