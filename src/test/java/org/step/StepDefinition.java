package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	public static WebDriver driver;

	@Given("user should be in the facebook login page {string}")
	public void user_should_be_in_the_facebook_login_page() {
	    
	}
	@When("User should enter the invalid {string}")
	public void user_should_enter_the_invalid(String string) {
	   driver.findElement(By.id("email")).sendKeys(string);
	}
	@When("user should enter the valid {string}")
	public void user_should_enter_the_valid(String string) {
	    driver.findElement(By.id("pass")).sendKeys(string);
	}
	@Then("user should clik the login button")
	public void user_should_clik_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}

}
