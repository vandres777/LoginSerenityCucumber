import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class Login implements Task {

    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(SauceDemoLoginPage.USERNAME_FIELD).thenHit(Keys.TAB),
                Enter.theValue(password).into(SauceDemoLoginPage.PASSWORD_FIELD).thenHit(Keys.ENTER)
        );
    }

    public static Login withCredentials(String username, String password) {
        return new Login(username, password);
    }
}