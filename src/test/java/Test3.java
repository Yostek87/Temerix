import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Test3 {

    private WebDriver webDriver;

        @Before
    public void setUp() {
        System.out.println("Start Browser");

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();


    }


    @Test
    public void someTest() throws InterruptedException {
        webDriver.get("https://kulibin.com.ua/");

        webDriver.findElement(By.id("catalog-menu")).click();

        webDriver.findElement(By.linkText("Электроинструмент")).click();

        webDriver.findElement(By.linkText("Шуруповерты")).click();

        List<WebElement> elements = webDriver.findElements(By.xpath("/html/body/div[3]/div[1]/main/div[3]/div[2]/ul/li[12]/div/div[1]/div[3]/img"));

        Thread.sleep(5000);

        webDriver.findElement(By.linkText("2")).click();

        elements = webDriver.findElements(By.cssSelector("#bx_2040626179_6988 > div.image.items_list_image_wrap_6988 > div.item-brand-country > img"));

        Thread.sleep(5000);

        webDriver.findElement(By.linkText("3")).click();

        elements = webDriver.findElements(By.cssSelector("#bx_2040626179_6988 > div.image.items_list_image_wrap_6988 > div.item-brand-country > img"));

        Thread.sleep(5000);

        System.out.println(elements);







        webDriver.quit();
    }
}




