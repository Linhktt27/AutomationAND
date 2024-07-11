package RunApp;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features ="D:\\demoautotest\\automobileand\\src\\test\\java\\Features\\Login.feature",
        glue = {"Login"},
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)

@Test
public class RunApp extends AbstractTestNGCucumberTests {

}
