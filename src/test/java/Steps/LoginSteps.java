package Steps;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static Steps.PageInitializers.loginPage;

public class LoginSteps extends CommonMethods {

    @Given("user is navigated tot he HRMS application")
    public void user_is_navigated_tot_he_hrms_application() {
        openBrowserAndLaunchApplication();
    }


    @When("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {
        sendText(loginPage.usernameBox, ConfigReader.getPropertyValue("username"));
        sendText(loginPage.passwordBox, ConfigReader.getPropertyValue("password"));
    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        click(loginPage.loginBtn);
    }
    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        System.out.println("Thank god! logged in successfully!");
    }



}
