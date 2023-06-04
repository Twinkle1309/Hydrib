package ResultVerification;

import CommanPages.Utils;
import org.testng.Assert;

public class ResultVerificationForRegisterPage extends Utils {
    public void registerPageTitle(){
        String registerPageTitle = driver.getTitle();
        

        Assert.assertEquals(registerPageTitle,"nopCommerce demo store. Register","Page is not match");
    }

}
