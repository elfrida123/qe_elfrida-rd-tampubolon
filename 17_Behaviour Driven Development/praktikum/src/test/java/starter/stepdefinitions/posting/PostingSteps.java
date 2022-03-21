package starter.stepdefinitions.posting;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.posting.Posting;

public class PostingSteps {
    @Steps
    Posting posting;

    @Given("I am on the home page")
    public void onTheHomePage(){
        posting.onHomePage();
    }

    @When("I write a post")
    public void WritePost(){
        posting.WritePost();
    }

    @And("I click Post button")
    public void ClickPostButton(){
        posting.ClickPostButton();
    }

    @Then("my post have been created")
    public void PostCreated(){
        posting.PostCreated();
    }
}
