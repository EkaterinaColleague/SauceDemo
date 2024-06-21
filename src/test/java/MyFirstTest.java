import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTest {
    @Test
    public void searchElements() {
        //1.открыть браузер
        //1.зайти на сайт
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.id("user-name"));
        browser.findElement(By.name("login-button"));
        browser.findElement(By.cssSelector("login-box"));
        browser.findElement(By.cssSelector("#login-button"));
        browser.findElement(By.xpath("//div[contains (@class), 'login_container']"));
        browser.findElement(By.xpath("//button[contains(text), 'Login')]"));
        browser.quit();
    }
}

