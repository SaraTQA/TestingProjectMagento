package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatsNewSectionPage extends BasePage{
   
    public WhatsNewSectionPage(WebDriver driver){
        super(driver);
  }

  By cartButtonBy = By.xpath("//a[@class='action showcart']");
  By firstProductNameBy = By.xpath("//a[@title='Phoebe Zipper Sweatshirt']");


  public WhatsNewSectionPage verifyNavigationFromPLP(){
    assertElementVisible(cartButtonBy);

    return this;

  }

  public WhatsNewSectionPage navigateToPDPViaName(){
    click(firstProductNameBy);

    return this;
  }
    
}
