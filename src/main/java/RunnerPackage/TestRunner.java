package RunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Gourav\\Personal\\Automation\\DemoProject\\src\\test\\resources\\Feature File\\Login.feature", 
glue="StepDef",
plugin = {"pretty","html:test-output"})
public class TestRunner 
{

}
