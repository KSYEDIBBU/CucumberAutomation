package com.automation.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.automation.helper.FileReaderManager;
import com.autotest.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\automation\\feature\\Automation.feature",
                 glue = "com\\automation\\stepdefinition",
                 plugin= {"pretty","html:Report","com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html","rerun:Report/rerun.txt"},
                 monochrome = true, 
                 dryRun = false, 
                 //tags="@RegressionTest",
                 strict = true)

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {

		String broswerName = FileReaderManager.getInstance().getcrInstance().getBrowserName();
		driver = BaseClass.browserOpen(broswerName);
		
	}

	@AfterClass
	public static void tearDown() {
		driver.close();

	}

}
