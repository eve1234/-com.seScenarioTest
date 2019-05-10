package com.se.stepDefinitions.backend.accountUsers;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
//import static io.restassured.module.jsv.JsonSchemaValidator.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;

public class UsersStepD {
	
	@Given("^I want to get all users \"([^\"]*)\"$")
	public void i_want_to_get_all_users(String url) {
		given().contentType(ContentType.JSON);
	    
	}

	@Then("^I should see all users$")
	public void i_should_see_all_users()  {
	    
	}

	//second scenario
	@Given("^I want to get a user  as \"([^\"]*)\"$")
	public void i_want_to_get_a_user_as(String userId) {
	    when().get(String.format("https://jsonplaceholder.typicode.com/%", userId))
	    		.then();
	    			//.body("name", "Ervin Howell")
	}

	@Then("^I should see a particular user details$")
	public void i_should_see_a_particular_user_details() {
		
	   
	}

	@Given("^I want to get a user as \"([^\"]*)\"$")
	public void i_want_to_get_a_user_using(String arg1)  {
	    
	}

	@Then("^I should see this particular user details$")
	public void i_should_see_this_particular_user_details()  {
	    
	}

}
