import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.Pages;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    Actor user = Actor.named("Víctor");
    WebDriver hisBrowser;
    Pages pages;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        user.can(BrowseTheWeb.with(hisBrowser));
        user.attemptsTo(Open.url(pages.getDefaultBaseUrl()));
    }

    @When("the user enters username {string} and password {string}")
    public void theUserEntersValidCredentials(String username, String password) {
        user.attemptsTo(Login.withCredentials(username, password));
    }

    @Then("the user should be redirected to the home page")
    public void theUserShouldBeRedirectedToTheHomePage() {
        // implement your verification logic here...
    }
}