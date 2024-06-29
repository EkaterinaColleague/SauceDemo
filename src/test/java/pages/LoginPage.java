package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.print.DocFlavor;

import static org.bouncycastle.cms.RecipientId.password;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    WebDriver driver;
    private final By USERNAME_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("login-button");
    private final By ERROR_MESSAGE = By.xpath("//*[@class= 'error-message-container error']");
    private String user;


    public void open() {
        driver.get(BASE_URL);
    }

    public void login(String user, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).submit();
    }

    public void getErrorMessage() {
        driver.findElement(ERROR_MESSAGE).getText();
    }
}