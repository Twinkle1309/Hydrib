package ResultVerification;

import CommanPages.Utils;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;

public class ResultVerificationForHomePage extends Utils {
    public void HomePageTitle(){
        String HomePageTitle = driver.getTitle();
        Assert.assertEquals(HomePageTitle,"nopCommerce demo store","Home page title not matched");
    }
}
