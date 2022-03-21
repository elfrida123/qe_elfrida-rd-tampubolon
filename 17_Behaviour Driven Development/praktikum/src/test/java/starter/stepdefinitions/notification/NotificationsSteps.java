package starter.stepdefinitions.notification;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.notification.Notification;

public class NotificationsSteps {
    @Steps
    Notification notification;

    @Given("I am on the notification page")
    public void onTheNotificationPage(){
        notification.onTheNotificationPage();
    }

    @And("I click notification that I want to see")
    public void ClickNotification(){
        notification.ClickNotification();
    }

    @Then("I see my notification")
    public void SeeNotifaction(){
        notification.SeeNotifaction();
    }
}
