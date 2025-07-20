
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
       // driver = new ChromeDriver();
    }

    @Test(invocationCount = 2, priority = 0)
    public void testGoogleTitle() {
        //driver.get("https://www.google.com");
        //Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Google Test");
    }

    @Test(invocationCount = 2, priority = -1)
    public void highPriority() {
        //driver.get("https://www.google.com");
        //Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Google Test Negative High Priority");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}