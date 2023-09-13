package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "src/test/resources/featureFiles/",
		glue= {"stepDefination"},
		plugin = {"pretty",
				"html:target/cucumber-reports/cucumber-html-report.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		tags = "@BMWBTN or @Login "
		)


public class testRun {
	
	
	

}
