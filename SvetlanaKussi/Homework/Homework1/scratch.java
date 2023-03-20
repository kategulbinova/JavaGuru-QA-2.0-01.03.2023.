class Scratch {
    {
        // Generated by Selenium IDE
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
        public class GoogleJavaTest {
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
            public void googleJava() {
                driver.get("https://www.google.com/");
                driver.manage().window().setSize(new Dimension(723, 860));
                {
                    WebElement element = driver.findElement(By.cssSelector("#gbwa .gb_e"));
                    Actions builder = new Actions(driver);
                    builder.moveToElement(element).perform();
                }
                {
                    WebElement element = driver.findElement(By.tagName("body"));
                    Actions builder = new Actions(driver);
                    builder.moveToElement(element, 0, 0).perform();
                }
                {
                    WebElement element = driver.findElement(By.cssSelector(".gb_1e"));
                    Actions builder = new Actions(driver);
                    builder.moveToElement(element).perform();
                }
                driver.findElement(By.name("q")).sendKeys("ja");
                driver.findElement(By.cssSelector("#jZ2SBf b")).click();
                driver.findElement(By.cssSelector(".tF2Cxc > .yuRUbf .LC20lb")).click();
                driver.findElement(By.cssSelector(".menu li:nth-child(1) > a")).click();
                {
                    WebElement element = driver.findElement(By.cssSelector(".menu .current-menu-item > a"));
                    Actions builder = new Actions(driver);
                    builder.moveToElement(element).perform();
                }
                {
                    WebElement element = driver.findElement(By.tagName("body"));
                    Actions builder = new Actions(driver);
                    builder.moveToElement(element, 0, 0).perform();
                }
                driver.findElement(By.linkText("Курс QA 2.0.")).click();
                driver.findElement(By.name("form-name")).click();
                driver.findElement(By.name("form-name")).sendKeys("Lana");
                driver.findElement(By.name("form-phone")).click();
                driver.findElement(By.name("form-phone")).sendKeys("111");
                driver.findElement(By.cssSelector(".default-button-submit")).click();
            }
        }

    }