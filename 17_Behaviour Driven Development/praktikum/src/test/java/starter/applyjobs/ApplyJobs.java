package starter.applyjobs;

import net.thucydides.core.annotations.Step;

public class ApplyJobs {
    @Step("I am on the job page")
    public void onTheJobPage(){
        System.out.println("I am on the job page");
    }

    @Step("I search the jobs in the search box")
    public void SearchJobs(){
        System.out.println("I search the jobs in the search box");
    }

    @Step("I click the result of the job")
    public void ClickResult(){
        System.out.println("I click the result of the job");
    }

    @Step("I see the job that I want to see")
    public void SeeJob(){
        System.out.println("I see the job that I want to see");
    }

    @Step("I click Apply now button")
    public void ClickApplyNowButton(){
        System.out.println("I click Apply now button");
    }
}
