package org.example.stubbr.faces.feature.randomfeature;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;

@SuppressWarnings("all")
public class Random {
  /* @Inject
   */private Logger log;
  
  @Given("^a consumer authenticated with \"([^\"]*)\" method \"([^\"]*)\" flow \"([^\"]*)\" scope \"([^\"]*)\"$")
  public void aConsumerAuthenticatedWithMethodFlowScope(final String arg1, final String arg2, final String arg3, final String arg4, final String arg5) throws Throwable {
    throw new PendingException();
  }
  
  @When("^the consumer does \"([^\"]*)\" on \"([^\"]*)\"$")
  public void theConsumerDoesOn(final String arg1, final String arg2, final String arg3) throws Throwable {
    throw new PendingException();
  }
  
  /* @And("^the request content type is \"([^\"]*)\"$")
   */public void theRequestContentTypeIs(final String arg1, final String arg2) throws Throwable {
    throw new PendingException();
  }
  
  /* @And("^the request body is \"([^\"]*)\"$")
   */public void theRequestBodyIs(final String arg1, final String arg2) throws Throwable {
    throw new PendingException();
  }
  
  @Then("^the endpoint should answer with a response$")
  public void theEndpointShouldAnswerWithAResponse(final String arg1) throws Throwable {
    throw new PendingException();
  }
  
  /* @And("^the response HTTP code should be (\\d+)$")
   */public void theResponseHTTPCodeShouldBe(final int arg1, final String arg2) throws Throwable {
    throw new PendingException();
  }
  
  /* @And("^the response content type should be \"([^\"]*)\"$")
   */public void theResponseContentTypeShouldBe(final String arg1, final String arg2) throws Throwable {
    throw new PendingException();
  }
  
  /* @And("^the response body should be \"([^\"]*)\"$")
   */public void theResponseBodyShouldBe(final String arg1, final String arg2) throws Throwable {
    throw new PendingException();
  }
}
