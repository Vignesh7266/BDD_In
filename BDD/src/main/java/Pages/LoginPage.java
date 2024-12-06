package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    WebDriver driver;
    public LoginPage (WebDriver driver){
        this.driver = driver;
    }
    private By byUserID = By.id("txtUserID");
    private By byPassword = By.id("txtPassword");
    private By byloginbtn = By.xpath("//input[@type='submit']");


    public void launchapplication() {
        launchbrowser();
        driver.get("http://digiorder-enterprise-dev.serinsol.com/");

    }

    public void EnterData(String Userid, String Password) {
        driver.findElement(byUserID).sendKeys(Userid);
        driver.findElement(byPassword).sendKeys(Password);

    }

    public void clickloginbutton() {
        driver.findElement(byloginbtn).click();
    }
}
