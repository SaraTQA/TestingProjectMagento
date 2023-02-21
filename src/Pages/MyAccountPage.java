package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver){
        super(driver);
    }

    By lumaLogoBy = By.xpath("//img[contains(@src,'images/logo.svg')]");

    public MyAccountPage verifySuccessfulSignup(){

        assertElementVisible(lumaLogoBy);
       
        return this;
    }
    
}
