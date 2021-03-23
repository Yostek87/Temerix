import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

    private WebDriver webDriver;

    @Before
    public void setUp() {
        System.out.println("Start Browser");

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();


    }


    @Test
    public void someTest() {
        System.out.println("Open website");
        webDriver.get("https://kulibin.com.ua/");
        webDriver.findElement(By.cssSelector("body > div.page > div.wrapper > div > div > div > div.col-xs-3 > div > div > ul > li:nth-child(3) > a")).click();
        webDriver.findElement(By.linkText("Дрели")).click();
        webDriver.findElement(By.cssSelector("#bx_2040626179_3858_pict > img")).click();
        webDriver.findElement(By.className("item_old_price old price"));
        webDriver.findElement(By.className("price"));
        webDriver.findElement(By.cssSelector("#bx_2040626179_3132_pict > img")).click();
        webDriver.findElement(By.className("item_old_price old price"));
        webDriver.findElement(By.className("price"));
        webDriver.findElement(By.cssSelector("#bx_2040626179_3139_pict > img")).click();
        webDriver.findElement(By.className("item_old_price old price"));
        webDriver.findElement(By.className("price"));





        webDriver.quit();
    }
}




