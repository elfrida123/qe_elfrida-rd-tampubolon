package starter.account;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {

    protected static String url = "https://demoqa.com/Account/";

    @Step("I set GET api endpoints for account")
    public String setApiEndpoints() {
        return url + "v1/User/{UUID}";
    }

    @Step("I send GET HTTP request for account")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200 for account")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
