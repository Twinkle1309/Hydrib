package StepDefinition;


import ResultVerification.ResultVerificationForHomePage;
import ResultVerification.ResultVerificationForRegisterPage;
import WebElements.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
     RegisterPage registerPage=new RegisterPage();
    ResultVerificationForRegisterPage resultVerificationForRegisterPage = new ResultVerificationForRegisterPage();
   // ResultVerificationForHomePage resultVerificationForHomePage = new ResultVerificationForHomePage();


    @When("^User Click on register link$")
    public void user_Click_on_register_link()  {
       registerPage.clickOnRegisterLink();
    }

    @When("^User on register page and verify register page title$")
    public void user_on_register_page_and_verify_register_page_title()  {
        resultVerificationForRegisterPage.registerPageTitle();
    }

    @Then("^User enter registration details$")
    public void user_enter_and_and_and_and_and()  {
registerPage.doRegister();
    }




}
