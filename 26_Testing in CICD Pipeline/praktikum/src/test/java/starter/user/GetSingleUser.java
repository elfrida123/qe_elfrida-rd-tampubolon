package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetSingleUser {
    protected static String url = "https://reqres.in/api/";

    @Step("I set GET api endpoints for single user")
    public String setApiEndpoints() {
        return url + "unknown/2";
    }

    @Step("I send GET HTTP Request single user")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200 single user")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail single user")
    public void validateDataDetailUser() {
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(2)));
        restAssuredThat(response -> response.body("'data'.'name'", equalTo("fuchsia rose")));
    }
}
