import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.ManagedPages;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.Pages;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

//@RunWith(SerenityRunner.class)// esta anotación solo va a generar el reporte simple, mejor usar @ExtendWith(SerenityJUnit5Extension.class)
@ExtendWith(SerenityJUnit5Extension.class)
class SauceDemoLoginTest {

    //@Managed(driver = "chrome")
    WebDriver hisBrowser;

    @ManagedPages
    Pages pages;

    Actor user = Actor.named("Víctor");

    @Test
    void login() {
        user.can(BrowseTheWeb.with(hisBrowser));
        user.attemptsTo(
                Open.url(pages.getDefaultBaseUrl()),
                Login.withCredentials("standard_user", "secret_sauce")
        );
    }
}