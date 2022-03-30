package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField(){
        return By.id("userName");
    }

    private By passwordField(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login");
    }

    private By Books(){
        return By.xpath("//div/div[6]/div");
    }

    private By productHeader(){
        return By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    }


    @Step
    public void openUrl(){
        open();
    }

    @Step
    public void openBooks(){
        $(Books()).click();
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public boolean headerAppears(){
        return $(productHeader()).isDisplayed();
    }

    @Step
    public boolean headerTextEqual(){
        return $(productHeader()).getText().equals("Login");
    }

}
