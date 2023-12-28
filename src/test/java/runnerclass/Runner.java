package runnerclass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.IPT_QA2_Goibibo.base.TestBase;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\learn\\eclipse-workspace\\TestNG\\QA2\\src\\test\\java\\com\\feature\\roomselect.feature", 
glue = "stepdefff",
monochrome =true

)
public class Runner extends TestBase  {
	@BeforeClass
	public static void browserLaunch() {
		launchBrowser("chrome");
	}


}
