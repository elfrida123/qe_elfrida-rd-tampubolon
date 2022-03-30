package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl();
        loginPage.openBooks();
        loginPage.clickLoginButton();
        loginPage.validateOnLoginPage();
    }

    @When("I input valid username")
    public void iInputValidUsername() {
        loginPage.inputUsername("putristmpl");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("1!KinoSu#");
    }

    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I go to profil page")
    public void iGoToProfilPage() {
        homePage.headerAppears();
        homePage.headerTextEqual();
    }

    @When("I input invalid username")
    public void iInputInvalidUsername() {
        loginPage.inputPassword("putri123");
    }

    @Then("I'm still on the login page")
    public void stillOnTheLoginPage() {
        loginPage.headerAppears();
        loginPage.headerTextEqual();
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginPage.inputPassword("onichan!");
    }

    @When("I input empty username")
    public void iInputEmptyUsername() {
        loginPage.inputPassword("");
    }

    @And("I input empty password")
    public void iInputEmptyPassword() {
        loginPage.inputPassword("");
    }
}
