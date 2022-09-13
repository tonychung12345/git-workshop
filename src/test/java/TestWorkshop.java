import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestWorkshop {

    WebDriver webDriver;

    @Before
    public void beforeTest(){
        // Create Chrome
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @After
    public void afterTest(){
        webDriver.quit();
    }

    @Test
    public void Test1() throws InterruptedException {


        //Wait
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(15));
        
        // Go to Apple website
        webDriver.get("https://www.apple.com");

        //Assign locator
        By iphoneLinkLocator = By.className("ac-gn-link-iphone");

        //Wait iphoneLink to present
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(iphoneLinkLocator));

        // Find iphoneLink
        WebElement iphoneLink = webDriver.findElement(iphoneLinkLocator);

        // Click iphoneLink
        iphoneLink.click();

        //Wait iphoneLink to present
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("chapternav-item-iphone-14-pro")));

        WebElement iphone14prolink = webDriver.findElement(By.className("chapternav-item-iphone-14-pro"));

        iphone14prolink.click();

        //Wait iphone14ProOrderLink to present
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("ac-ln-action-button")));

        WebElement iphone14ProOrderLink = webDriver.findElement(By.className("ac-ln-action-button"));

        iphone14ProOrderLink.click();

        Thread.sleep(5000);

        //Quit Chrome
      //  webDriver.quit();

    }

    @Test
    public void Test2() throws InterruptedException {
        // Create Chrome
      //  WebDriverManager.chromedriver().setup();
       // WebDriver webDriver = new ChromeDriver();

        //Wait
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(15));

        // Go to Apple website
        webDriver.get("https://www.apple.com");

        //Assign locator
        By searchButtonLocator = By.id("ac-gn-link-search");

        //Wait iphoneLink to present
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(searchButtonLocator));

        // Find iphoneLink
        WebElement searchButton = webDriver.findElement(searchButtonLocator);

        // Click iphoneLink
        searchButton.click();

        //Assign locator
        By searchInputLocator = By.id("ac-gn-searchform-input");

        //Wait iphoneLink to present
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(searchInputLocator));

        // Find iphoneLink
        WebElement searchInput = webDriver.findElement(searchInputLocator);

        // Click iphoneLink
        searchInput.click();

        searchInput.sendKeys("iphone 14 pro max");

        searchInput.sendKeys(Keys.ENTER);

        Thread.sleep(5000);

        //Assign locator
        By searchSubmitButtonLocator = By.id("ac-gn-searchform-submit");

        //Wait iphoneLink to present
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(searchSubmitButtonLocator));

        // Find iphoneLink
        WebElement searchSubmitButton = webDriver.findElement(searchSubmitButtonLocator);

        // Click iphoneLink
       // searchSubmitButton.click();
    }

}
