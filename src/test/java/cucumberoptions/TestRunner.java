package cucumberoptions;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"."},monochrome=true,
		glue="stepDefinition",plugin= 
	{"pretty","html:target/cucumber",
				"json:target/cucumber.json",
		"junit:target/cukes.xml",		
				"rerun:target/rerun.txt",
		})
public class TestRunner 
{

}
