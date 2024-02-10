import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/login.feature", // specify the path to your feature files here
        glue = "", // specify the package where your step definitions are located
        plugin = "pretty"
        //plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
}