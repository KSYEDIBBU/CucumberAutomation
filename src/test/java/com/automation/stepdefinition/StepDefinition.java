package com.automation.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.SendKeys;

import com.automation.helper.FileReaderManager;
import com.automation.pom.PageObjectManager;
import com.automation.runner.Runner;
import com.autotest.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import junit.framework.Assert;
import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	// public static WebDriver driver=BaseClass.browserOpen("chrome");

	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user search the application$")
	public void user_search_the_application() throws Throwable {
		String url = FileReaderManager.getInstance().getcrInstance().geturl();
		getUrl(url);
		System.out.println("URL Loaded");
		Thread.sleep(5000);
		mouseClick(pom.getHp().getLogin());
		Thread.sleep(3000);
	}

	@When("^user enter the valid username in username field$")
	public void user_enter_the_valid_username_in_username_field() throws Throwable {
		sendkeys(pom.getSgnp().getMail(), "asdagjh@gmail.com");
		Thread.sleep(3000);

	}

	@When("^user enter the valid password in password field$")
	public void user_enter_the_valid_password_in_password_field() throws Throwable {
		sendkeys(pom.getSgnp().getPasswd(), "chennai");
		Thread.sleep(3000);
	}

	@When("^user click login field$")
	public void user_click_login_field() throws Throwable {
		mouseClick(pom.getSgnp().getSign());
		Thread.sleep(3000);
	}

	@Then("^user conform go to homepage$")
	public void user_conform_go_to_homepage() throws Throwable {

	}

	@Given("^user navigates to shirt in women option$")
	public void user_navigates_to_shirt_in_women_option() throws Throwable {
		actionMethod(pom.getBo().getWomen(), pom.getBo().getTshirt(), "element");
		Thread.sleep(3000);
	}

	@When("^user click on tshirt image to book$")
	public void user_click_on_tshirt_image_to_book() throws Throwable {
		mouseClick(pom.getBo().getImg());
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
	}

	@When("^user choose the quality of the tshirt$")
	public void user_choose_the_quality_of_the_tshirt() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user choose the addchart to hold the booking$")
	public void user_choose_the_addchart_to_hold_the_booking() throws Throwable {
		mouseClick(pom.getBo().getCart());
		Thread.sleep(3000);
	}

	@When("^user to procceed to checkout$")
	public void user_to_procceed_to_checkout() throws Throwable {
		mouseClick(pom.getBo().getCheckout());
		Thread.sleep(3000);
	}

	@Then("^user verifies selection of tshirt is done$")
	public void user_verifies_selection_of_tshirt_is_done() throws Throwable {
			}

	@Given("^user navigates to summary page$")
	public void user_navigates_to_summary_page() throws Throwable {
		mouseClick(pom.getPo().getProd());
		Thread.sleep(3000);
		
	}

	@When("^user checks for delivery order on billing address$")
	public void user_checks_for_delivery_order_on_billing_address() throws Throwable {
		mouseClick(pom.getPo().getAddchk());
		Thread.sleep(3000);

	}

	@When("^user confirm to book on agree  terms and conditions$")
	public void user_confirm_to_book_on_agree_terms_and_conditions() throws Throwable {
		mouseClick(pom.getPo().getChkbox());
		Thread.sleep(3000);
		
		mouseClick(pom.getPo().getNxtpg());
		Thread.sleep(2000);
	}

	@When("^user to proceed for payment$")
	public void user_to_proceed_for_payment() throws Throwable {
		mouseClick(pom.getPo().getPmtpg());
		Thread.sleep(2000);
	}

	@When("^user confirm the order$")
	public void user_confirm_the_order() throws Throwable {
		mouseClick(pom.getPo().getFinpg());
		Thread.sleep(2000);
	}

	@Then("^user order place succesfully$")
	public void user_order_place_succesfully() throws Throwable {
		Assert.assertEquals("", "  ");
	}
}
