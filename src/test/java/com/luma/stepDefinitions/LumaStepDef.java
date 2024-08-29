package com.luma.stepDefinitions;

import com.luma.pages.CreateAccountPage;
import com.luma.pages.LumaMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class LumaStepDef {

        WebDriver driver = DriverHelper.getDriver();

        LumaMainPage mainPage = new LumaMainPage(driver);
        CreateAccountPage accountPage = new CreateAccountPage(driver);



    @Given("user is on the main page of Luma user clicks on create account button")
    public void user_is_on_the_main_page_of_luma_user_clicks_on_create_account_button() {
        mainPage.clickOnCreateAccount();
    }
    @When("user is on create account page user enters name as {string} and lastname as {string}")
    public void user_is_on_create_account_page_user_enters_name_as_and_lastname_as(String firstname, String lastname) {
        accountPage.entersFirstAndLastName(firstname,lastname);
    }
    @Then("user enters email as {string} and password as {string} and confirms password as {string}")
    public void user_enters_email_as_and_password_as_and_confirms_password_as(String email, String password, String confirmPassword) {
        accountPage.EntersEmailAndPasswordAndConfirmPassword(email, password, confirmPassword);
    }
    @Then("user clicks on create account button and validates success message as {string}")
    public void user_clicks_on_create_account_button_and_validates_success_message_as(String successMessage) {
        accountPage.createAccount(successMessage);
    }

}
