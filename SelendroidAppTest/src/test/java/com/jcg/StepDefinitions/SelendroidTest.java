package com.jcg.StepDefinitions;

import com.jcg.PageObjectModel.DriverInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

public class SelendroidTest {

	private WebDriver driver = null;

	@Given("^I open appr$")
	public void iOpenApp() throws Throwable {
		webDriver = DriverInitializer.getDriver("app");
	}

	@Then("^Title should be \"([^\"]*)\"$")
    public void Titleshouldbe() throws Throwable {
    String Actual = driver.getTitle();
    String Expected = "selendroid-test-app";

    if (Actual.equals(Expected)) {
               System.out.println("Test Passed!");
    } else {
               System.out.println("Test Failed");
    }

	@Then("^I verify elements are \"([^\"]*)\"$")
	public void IverifyElements() throws Throwable {
		// Selecting Element
		MobileElement pElement = (MobileElement) driver.findElementByAccessibilityId("SomeAccessibilityID");
		// Checking if it displayed on screen.
		boolean isDisplayed = pElement.isDisplayed();
	}

	@When("^I tap on EN button$")
	public void iClickOnENButton() throws Throwable {
		MobileElement mobElement = (MobileElement) driver.findElement(By.id("EN-Btn"));
		mobElement.click();
	}

	@Then("^I Verify HomePage displayed$")
	public void IVerifyHomepage() throws Exception {
		WebElement inputField = driver.findElement(By.id("Home"));
		Assert.assertEquals("true", inputField.getAttribute("enabled"));
		inputField.sendKeys("Selendroid");
	}

	@Given("^I open app$")
	public void iOpenApp() throws Throwable {
		webDriver = DriverInitializer.getDriver("app");
	}

	@When("^I tap on ChromeLogo$")
	public void iClickOnENButton() throws Throwable {
		MobileElement mobElement = (MobileElement) driver.findElement(By.id("EN-Btn"));
		mobElement.click();
	}

	@Then("^I Verify Title should be \"([^\"]*)\"$")
       public void Titleshouldbe() throws Throwable {
       String Actual = driver.getTitle();
       String Expected = "Hello, can you please tell me your name";

       if (Actual.equals(Expected)) {
                  System.out.println("Test Passed!");
       } else {
                  System.out.println("Test Failed");
       }

	@When("^I Enter name$")
	public void Ientername() throws Throwable {
		WebElement inputField = driver.findElement(By.id("my_text_field"));
		// enter a text into the text field
		inputField.sendKeys("name");
		// check if the text has been entered into the text field
		Assert.assertEquals("Selendroid", inputField.getText());
	}

}