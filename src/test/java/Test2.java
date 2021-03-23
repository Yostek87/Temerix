import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test2 {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test2() {
        // Test name: Test2
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("https://kulibin.com.ua/");
        // 2 | setWindowSize | 1081x824 |
        driver.manage().window().setSize(new Dimension(1081, 824));
        // 3 | mouseOver | linkText=Электроинструмент |
        {
            WebElement element = driver.findElement(By.linkText("Электроинструмент"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        // 4 | mouseOut | linkText=Электроинструмент |
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        // 5 | mouseOver | linkText=Перфораторы |
        {
            WebElement element = driver.findElement(By.linkText("Перфораторы"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        // 6 | click | linkText=Перфораторы |
        driver.findElement(By.linkText("Перфораторы")).click();
        // 7 | runScript | window.scrollTo(0,1000) |
        js.executeScript("window.scrollTo(0,1000)");
        // 8 | click | linkText=2 |
        driver.findElement(By.linkText("2")).click();
        // 9 | runScript | window.scrollTo(0,2500) |
        js.executeScript("window.scrollTo(0,2500)");
        // 10 | runScript | window.scrollTo(0,1.600000023841858) |
        js.executeScript("window.scrollTo(0,1.600000023841858)");
        // 11 | runScript | window.scrollTo(0,601.5999755859375) |
        js.executeScript("window.scrollTo(0,601.5999755859375)");
        // 12 | runScript | window.scrollTo(0,1600) |
        js.executeScript("window.scrollTo(0,1600)");
        // 13 | close |  |
        driver.close();
    }
}
