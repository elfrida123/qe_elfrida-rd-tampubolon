package starter.message;


import net.thucydides.core.annotations.Step;

public class Message {
    @Step("I am on the message page")
    public void onTheMessagePage(){
        System.out.println("I am on the message page");
    }

    @Step("I search name of people that I want to message in search box")
    public void SearchPeople(){
        System.out.println("I search name of people that I want to message in search box");
    }

    @Step("I click the name of people")
    public void ClickName(){
        System.out.println("I click the name of people");
    }

    @Step("I write text")
    public void WriteText(){
        System.out.println("I write text");
    }

    @Step("I click Send button")
    public void ClickSendButton(){
        System.out.println("I click Send button");
    }

    @Step("my message have been sent")
    public void MessageSent(){
        System.out.println("my message have been sent");
    }
}
