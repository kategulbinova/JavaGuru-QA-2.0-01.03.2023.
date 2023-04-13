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
public class 1testTest {
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
public void 1test() {
        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(1348, 887));
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("javaguru");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc > .yuRUbf .LC20lb")).click();
        driver.findElement(By.cssSelector(".transparent-button > .default-button")).click();
        js.executeScript("window.scrollTo(0,5)");
        driver.findElement(By.cssSelector(".header-button > .default-button")).click();
        }
        }