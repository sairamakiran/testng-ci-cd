

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Set Chrome options to run in incognito
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
    }

    @Test(groups = {"sanity", "regression"})
    public void testGoogleSearch() {
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Make My Trip");
        searchBox.sendKeys(Keys.ENTER);
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
