package Tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LoginTest  extends BaseTest{
    @Test
    public void correctLogin() {
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");
        assertEquals(driver.findElement(By.xpath("//*[@class= 'title']")).getText(), "Products");
    }
    @Test
    public void loginNoPassword() {
        loginPage.open();
        loginPage.login("standard_user","");
        assertEquals(driver.findElement(By.xpath("//*[@class= 'error-message-container error']")).getText(), "Epic sadface: Password is required");
    }
    @Test
    public void loginFalse() {
        loginPage.open();
        loginPage.login("Katy_user","secret_sauce");
        assertEquals(driver.findElement(By.xpath("//*[@class= 'error-message-container error']")).getText(), "Epic sadface: Username and password do not match any user in this service");
    }
    @Test
    public void loginWrongPassword() {
        loginPage.open();
        loginPage.login("locked_out_user","secret");
        assertEquals(driver.findElement(By.xpath("//*[@class= 'error-message-container error']")).getText(), "Epic sadface: Username and password do not match any user in this service");
    }
}