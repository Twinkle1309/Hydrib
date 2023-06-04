package WebElements;

import CommanPages.LoadProperty;
import CommanPages.Utils;
import org.openqa.selenium.By;

public class RegisterPage extends Utils {

    LoadProperty loadProperty = new LoadProperty();
    private By registerLink = By.className("ico-register");

    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");

    private By email = By.id("Email");

    private By password = By.id("Password");
    private By confirmPassword = By.xpath("//*[@id=\"ConfirmPassword\"]");
    private By registerButton = By.id("register-button");
    public void clickOnRegisterLink(){

        doClick(registerLink);
    }
    public  void doRegister(){


        doSendKey(firstName,loadProperty.getProperty("Firstname"));
        doSendKey(lastName,loadProperty.getProperty("Lastname"));

        doSendKey(email,loadProperty.getProperty("Email"));

        doSendKey(password,loadProperty.getProperty("Password"));
        doSendKey(confirmPassword,loadProperty.getProperty("Confirmpassword"));
        doClick(registerButton);

    }
}
