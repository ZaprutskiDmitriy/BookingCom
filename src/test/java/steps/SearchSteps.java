package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SearchPage;
import pages.SearchResultsPage;

import static org.testng.Assert.assertEquals;

public class SearchSteps {

    private static final String BOOKING_URL = "https://www.booking.com";
    private SearchPage searchPage;
    private SearchResultsPage searchResultsPage;

    private WebDriver driver;

    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("user is on the search page")
    public void userIsOnTheSearchPage() {
        driver.get(BOOKING_URL);
        searchPage = new SearchPage(driver);
    }

    @When("user is searching for hotel {string}")
    public void userIsSearchingForHotel(String searchString) {
        searchPage.searchBySearchString(searchString);
        searchResultsPage = new SearchResultsPage(driver);
    }

    @Then("{string} exists on the result page")
    public void existsOnTheResultPage(String hotelName) {
        assertEquals(searchResultsPage.getNameResultOfSearching(), hotelName);
    }

    @And("hotel's rating is {string}")
    public void hotelSRatingIs(String rating) {
        assertEquals(searchResultsPage.getRatingResultOfSearching(), rating);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
