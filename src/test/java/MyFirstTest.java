import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;

public class MyFirstTest {
    @Test
    public void search() {
        //1.открыть браузер
        //1.зайти на сайт
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.id("user-name"));
        browser.findElement(By.name("login-button"));
        browser.findElement(By.cssSelector(".login-box"));
        browser.findElement(By.cssSelector("#login-button"));
        browser.findElement(By.xpath("//div[@class= 'login_credentials' and text()='standard_user']"));
        browser.findElement(By.xpath("//*[@class = 'login_logo' and text() ='Swag Labs']"));
        browser.findElement(By.xpath("//*[contains(text(),'Accepted usernames are')]"));
        browser.findElement(By.xpath("//*[text()='error_user']//ancestor::div[@class = 'login_container']"));
        browser.findElement(By.xpath ("//*[@class= 'submit-button btn_action' or @name = 'login-button']"));
        browser.quit();
    }
}

