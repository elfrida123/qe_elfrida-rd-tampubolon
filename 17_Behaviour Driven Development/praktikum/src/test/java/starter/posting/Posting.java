package starter.posting;

import net.thucydides.core.annotations.Step;

public class Posting {

    @Step("I am on the home page")
    public void onHomePage(){
        System.out.println("I am on the home page");
    }

    @Step("I write a post")
    public void WritePost(){
        System.out.println("I write a post");
    }

    @Step("I click Post button")
    public void ClickPostButton(){
        System.out.println("I click Post button");
    }

    @Step("my post have been created")
    public void PostCreated(){
        System.out.println("my post have been created");
    }
}
