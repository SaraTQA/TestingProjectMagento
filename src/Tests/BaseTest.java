package Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    WebDriver driver;
    String firstName = "Sara";
    String lastName = "Todorovic";
    String validEmail = "todorovic.sara@yahoo.com";
    String validPassword = "ComtradeQA123";
    String confirmPassword = "ComtradeQA123";
    

    @Before
    public void setUp(){
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
    }

    @After
    public void teardown(){
        driver.quit();
        
    }
}
