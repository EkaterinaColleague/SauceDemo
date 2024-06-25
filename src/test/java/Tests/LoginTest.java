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
}
