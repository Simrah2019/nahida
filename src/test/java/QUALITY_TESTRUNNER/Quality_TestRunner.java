package QUALITY_TESTRUNNER;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import QUALITY_UTILITY.Quality_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src\\test\\resources\\QUALITY_FEATURES"},
plugin = {"json:target/cucumber.json"},
glue = "QUALITY_STEPDEFF", tags = {" @nahida2 "})



 
public class Quality_TestRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void QualityStartURL() {
		
		Quality_Base startURL=new Quality_Base();
		startURL.Quality_Browser();
		
	}
	
	@AfterTest
	public void QualityCloseURL() throws InterruptedException {
		Quality_Base startURL = new Quality_Base();
		Thread.sleep(2000);
		startURL.driver.quit();
	}
}
