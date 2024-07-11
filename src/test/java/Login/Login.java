package Login;

import RunApp.CommondVariable;
import RunApp.Setting;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

import static RunApp.Setting.driver;

public class Login {
    AppiumDriver driver = Setting.setup();
    LoginModel login = new LoginModel(driver);

    CommondVariable comd = new CommondVariable() {};

    public Login() throws MalformedURLException {
    }

    @Before
    public void beforeTest() throws MalformedURLException {
       // Setting.setup();
        login.clickOnButtonStart();
        login.clickOnButtonPermiss();
        //login.clickOnClosePopup();
    }
    @When("I fill username is account no")
    public void i_fill_username_is_account_no() {
        login.fillUsername(comd.userMain);
    }
    @When("I fill password of account no")
    public void i_fill_password_of_account_no() {
        login.fillPassword(comd.passMain);
    }
    @When("I click on button Login")
    public void i_click_on_button_login() {
        login.clickOnButtonLogin();
    }
    @Then("I login success")
    public void i_login_success() {
        login.verifyLoginSuccess(comd.userMain,comd.usernameMain);
    }

    @When("I fill username is smartid")
    public void iFillUsernameIsSmartid() {
        login.fillUsername(comd.smartidMain);
    }
    @When("I fill password of smartid")
    public void iFillPasswordOfSmartid() {
        login.fillPassword(comd.passMain);
    }

    @When("I fill username invalid")
    public void iFillUsernameInvalid() {
        login.fillUsername("linh27");
    }

    @When("I fill password")
    public void iFillPassword() {
        login.fillPassword(comd.passMain);
    }

    @Then("I login fail")
    public void iLoginFail() {
    }


    @After
    public void afterTest() throws Exception {
         Setting.tearDown(driver);

    }


}
