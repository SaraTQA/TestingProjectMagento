package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage extends BasePage{
    public ProductListPage(WebDriver driver){
        super(driver);
    }

    By bigPictureBy = By.xpath("//img[@src='https://magento.softwaretestingboard.com/pub/media/wysiwyg/home/home-main.jpg']");
    By dropDownMenuBy = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]");
    By signoutButtonBy = By.cssSelector("body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.customer-welcome > span > button");
    By whatsNewButtonBy = By.id("ui-id-3");


    public ProductListPage verifySuccessfulLogin(){
        assertElementVisible(bigPictureBy);
        
        return this;
    } 

    public ProductListPage expandMenu(){
        click(dropDownMenuBy);

        return this;
    }

    public ProductListPage navigateToHomepage(){
        click(signoutButtonBy);

        return this;
    }

    public ProductListPage navigateToWhatsNewSection(){
        click(whatsNewButtonBy);

        return this;
    }
}
