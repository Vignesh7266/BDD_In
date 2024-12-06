package StepDefinition;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();
    @Given("I launch application")
    public void i_launch_application() {
    loginPage.launchapplication();
    }

    @When("I enter userID {string} and password {string}")
    public void i_enter_user_id_and_password(String ID, String Password) {
        loginPage.EnterData(ID,Password);
    }

    @And("I click on login button")
    public void i_Click_On_LoginButton() {
        loginPage.clickloginbutton();
    }
    HomePage homePage = new HomePage();
    @Then("I see homepage")
    public void iSeeHomepage() {
        homePage.homepagetitle();
    }


}
