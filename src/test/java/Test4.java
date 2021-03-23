import org.apache.tools.ant.taskdefs.optional.script.ScriptDef;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test4 {

    private WebDriver webDriver;

    @Before
    public void setUp() {
        System.out.println("Start Browser");

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.manage().window().setSize(new Dimension(1082, 824));

        webDriver.findElement(By.linkText("Перфораторы")).click();

        {
            WebElement element = webDriver.findElement(By.cssSelector(".schedule > .text"));
            Actions builder = new Actions(webDriver);
            builder.moveToElement(element).perform();
        }

        webDriver.findElement(By.cssSelector("#bx_2040626179_3223_pict > img")).click();


        JavascriptExecutor js = null;
        js.executeScript("window.scrollTo(0,325.6000061035156)");

        webDriver.findElement(By.cssSelector("#bx_2040626179_31003_pict > img")).click();

        js.executeScript("window.scrollTo(0,694.4000244140625)");

        webDriver.findElement(By.cssSelector("#bx_2040626179_4473_pict > img")).click();

        js.executeScript("window.scrollTo(0,217.60000610351562)");

        js.executeScript("window.scrollTo(0,998.4000244140625)");

        webDriver.findElement(By.cssSelector("#bx_2040626179_3405_pict > img")).click();

        js.executeScript("window.scrollTo(0,400)");

        js.executeScript("window.scrollTo(0,1000)");

        webDriver.findElement(By.cssSelector("#bx_2040626179_7012_pict > img")).click();

        js.executeScript("window.scrollTo(0,1000)");

        {
            WebElement element = webDriver.findElement(By.id("catalog-menu"));
            Actions builder = new Actions(webDriver);
            builder.moveToElement(element).perform();
        }

        js.executeScript("window.scrollTo(0,500)");

        webDriver.findElement(By.cssSelector("#bx_2040626179_3246_pict > img")).click();

        js.executeScript("window.scrollTo(0,1.600000023841858)");

        webDriver.findElement(By.cssSelector("#bx_2040626179_3246 .comments")).click();

        js.executeScript("window.scrollTo(0,687.2000122070312)");

        js.executeScript("window.scrollTo(0,763.2000122070312)");

        js.executeScript("window.scrollTo(0,1400)");

        webDriver.findElement(By.cssSelector("#bx_2040626179_60970_pict > img")).click();

        js.executeScript("window.scrollTo(0,592)");

        js.executeScript("window.scrollTo(0,1928.800048828125)");

        webDriver.findElement(By.cssSelector(".col-xs-9")).click();

        webDriver.findElement(By.linkText("2")).click();

        js.executeScript("window.scrollTo(0,1.600000023841858)");

        js.executeScript("window.scrollTo(0,900)");

        webDriver.findElement(By.cssSelector("#bx_2040626179_34050_pict > img")).click();

        {
            WebElement element = webDriver.findElement(By.id("catalog-menu"));
            Actions builder = new Actions(webDriver);
            builder.moveToElement(element).perform();
        }

        js.executeScript("window.scrollTo(0,1561.5999755859375)");

        {
            WebElement element = webDriver.findElement(By.cssSelector("#bx_2040626179_34049_pict > img"));
            Actions builder = new Actions(webDriver);
            builder.moveToElement(element).perform();
        }

        {
            WebElement element = webDriver.findElement(By.tagName("body"));
            Actions builder = new Actions(webDriver);
            builder.moveToElement(element, 0, 0).perform();
        }

        webDriver.findElement(By.cssSelector("#bx_2040626179_62518_pict > img")).click();

        js.executeScript("window.scrollTo(0,600)");

        js.executeScript("window.scrollTo(0,3076)");

        webDriver.findElement(By.linkText("3")).click();

        js.executeScript("window.scrollTo(0,1100)");

        js.executeScript("window.scrollTo(0,1398.4000244140625)");

        webDriver.findElement(By.cssSelector("#bx_2040626179_61076_pict > img")).click();



        webDriver.quit();
    }
}





