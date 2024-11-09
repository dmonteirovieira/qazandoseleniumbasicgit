package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        //para criar relatório, é colocar os parametros aqui no plugin.
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = {"~@ignore"},
        //tags = {"@cadastro-sucesso, @cadastro-sucesso2"},
        strict = true
)

public class RunCucumberTest extends RunBase{

    @AfterClass
    public static void stop(){
        driver.quit();
    }
}
