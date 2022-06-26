package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:feature", //".src\\test\\resources\\feature", // 
		glue = "step.definition",
		tags = "@DesktopTab",
		dryRun = false,
		monochrome = true,
		strict = true,
		plugin = {"pretty", "html:target/site/cucumber-pretty",
				"json:target/cucumber.json"},
		publish = true


		)
//TestRunner doesn't extend Base
public class TestRunner {
	
	/**
	 * @AfterClass will execute the block of code when all scenarios are completed 
	 * or in another word, @AfterClass executes after "After Hooks of last scenario.
	 */
	//@AfterClass
	//public static generateReporte(){
	//CucumberRe....}
}
