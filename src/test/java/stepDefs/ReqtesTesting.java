package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import com.sun.org.apache.regexp.internal.RE;
import io.restassured.response.Response;
import org.junit.Test;
import sun.security.x509.OtherName;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import javax.naming.ldap.StartTlsResponse;
import javax.xml.soap.SAAJResult;

import java.util.Currency;

import static org.hamcrest.Matchers.*;





public class ReqtesTesting {

    @Given("^I am on requrs website$")
    public void i_am_on_requrs_website(){

        Response res = given()
                .when().get("https://reqres.in/");

    }

    @When("^I click on Get method$")
    public void i_click_on_Get_method() {
        Response res = given()
                .when().get("https://reqres.in/api/users?page=2");

    }

    @Then("^I should see response$")
    public void i_should_see_response() {
        Response res = given()
                .when().get("https://reqres.in/api/users?page=2");
                res.then().statusCode(200)
                        .body("page",is(equalTo(2)));

                res.prettyPrint();

    }
}
