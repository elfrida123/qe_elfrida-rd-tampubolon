package starter.notification;

import net.thucydides.core.annotations.Step;

public class Notification {
    @Step("I am on the notification page")
    public void onTheNotificationPage(){
        System.out.println("I am on the notification page");
    }

    @Step("I click notification that I want to see")
    public void ClickNotification(){
        System.out.println("I click notification that I want to see");
    }

    @Step("I see my notification")
    public void SeeNotifaction(){
        System.out.println("I see my notification");
    }


}
