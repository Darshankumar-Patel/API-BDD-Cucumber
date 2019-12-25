package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class ReqtesOutlineTesting {

    @Given("^I am on reqres\\\\.in$")
    public void i_am_on_reqres_in() {

    }

    @When("^I type \"([^\"]*)\"$")
    public void i_type(String arg1) {
        Response res = given()
                .when().get("<endpoints>");


    }

    @Then("^I shoud get \"([^\"]*)\"$")
    public void i_shoud_get(String arg1) {
        ResponseSpecification res = given()
        .then().body(hasItems("<response>"));

    }

}