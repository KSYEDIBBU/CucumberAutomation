package com.automation.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.automation.helper.FileReaderManager;
import com.autotest.baseclass.BaseClass;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@ExtendedCucumberOptions(retryCount = 4, jsonReport = "REPORT/JSONrEPORT.JSON")
@CucumberOptions(features = "@Report/rerun.txt", glue = "com\\automation\\stepdefinition", 
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report\\rerunReport.html"}, 
monochrome = true, 
dryRun = false, 
strict = true)

public class Re_Runner {

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
