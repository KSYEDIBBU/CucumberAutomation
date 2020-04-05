package com.automation.stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void beforeScenario(Scenario s) {
		System.out.println("Scenario:"+s.getName());
	}

	@After
	public void afterScenario(Scenario stat) {
		System.out.println("Scenario status is"+stat.getStatus());
	}
}
