import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MySecondTest {
    @Test
    public void searchByName() {
        //1.открыть браузер
        //1.зайти на сайт
        System.setProperties(
                "webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.name("login-button"));
        browser.findElement(By.cssSelector("login-box"));

        browser.quit();
    }


