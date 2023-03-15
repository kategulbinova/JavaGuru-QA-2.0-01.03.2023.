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
public class Homework1Test {
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
  public void homework1() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1439, 875));
    driver.findElement(By.name("q")).sendKeys("javaguru");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".tF2Cxc > .yuRUbf .LC20lb")).click();
    driver.findElement(By.id("CybotCookiebotDialogBodyButtonDecline")).click();
    {
      WebElement element = driver.findElement(By.id("CybotCookiebotDialogBodyButtonDecline"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    js.executeScript("window.scrollTo(0,3694)");
    driver.findElement(By.cssSelector(".menu li:nth-child(1) > a")).click();
    driver.findElement(By.linkText("Course QA 2.0.")).click();
    driver.findElement(By.name("form-name")).click();
    driver.findElement(By.name("form-name")).sendKeys("0");
    driver.findElement(By.name("form-code")).sendKeys("0");
    driver.findElement(By.name("form-phone")).sendKeys("0");
    driver.findElement(By.name("form-email")).sendKeys("00");
    driver.findElement(By.cssSelector(".default-button-submit")).click();
    driver.findElement(By.cssSelector(".checkbox-mark > img")).click();
    driver.findElement(By.cssSelector(".default-button-submit")).click();
  }
}
