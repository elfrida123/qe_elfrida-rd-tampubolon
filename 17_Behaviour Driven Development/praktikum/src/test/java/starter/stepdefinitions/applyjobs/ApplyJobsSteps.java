package starter.stepdefinitions.applyjobs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.applyjobs.ApplyJobs;

public class ApplyJobsSteps {
    @Steps
    ApplyJobs applyJobs;

    @Given("I am on the job page")
    public void onTheJobPage(){
        applyJobs.onTheJobPage();
    }

    @When("I search the jobs in the search box")
    public void SearchJobs(){
        applyJobs.SearchJobs();
    }

    @And("I click the result of the job")
    public void ClickResult(){
        applyJobs.ClickResult();
    }

    @Then("I see the job that I want to see")
    public void SeeJob(){
        applyJobs.SeeJob();
    }

    @Then("I click Apply now button")
    public void ClickApplyNowButton(){
        applyJobs.ClickApplyNowButton();
    }
}
