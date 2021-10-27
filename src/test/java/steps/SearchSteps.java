package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
    @Given("user is on the search page")
    public void userIsOnTheSearchPage() {
    }

    @When("user is searching for hotel {string}")
    public void userIsSearchingForHotel(String arg0) {
    }

    @Then("{string} exists on the result page")
    public void existsOnTheResultPage(String arg0) {
    }

    @And("hotel's rating is {string}")
    public void hotelSRatingIs(String arg0) {
    }
}
