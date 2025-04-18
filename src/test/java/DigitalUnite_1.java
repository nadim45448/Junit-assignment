import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DigitalUnite_1 {
    WebDriver driver;

    @BeforeAll
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    public void scrollDown(WebDriver driver, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")");
    }

    @DisplayName("Fillup the Digital Unite user form")
    @Test
    public void webFormAutomation() throws InterruptedException {
        driver.get("https://www.digitalunite.com/practice-webform-learners");

        scrollDown(driver, 500);
        driver.findElement(By.id("edit-name")).sendKeys("Nadim Hossain");
        driver.findElement(By.id("edit-number")).sendKeys("01712345612");

        WebElement txtCalendar = driver.findElement(By.id("edit-date"));
        txtCalendar.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
        txtCalendar.sendKeys("04/17/2025");
        txtCalendar.sendKeys(Keys.ENTER);

        driver.findElement(By.id("edit-email")).sendKeys("nadimmhf@gmail.com");
        driver.findElement(By.tagName("textarea")).sendKeys("I am Nadim Hossain, 4th year computer science student at AIUB");
        scrollDown(driver, 400);
        String filepath = Paths.get("src/test/resources/cv.pdf").toAbsolutePath().toString();
        driver.findElement(By.cssSelector("[type=file]")).sendKeys(filepath);
        Thread.sleep(3000);

        WebElement checkBox = driver.findElement(By.id("edit-age"));
        if (!checkBox.isSelected()) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBox);
        }
        Thread.sleep(3000);

        WebElement submitButton = driver.findElement(By.id("edit-submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);
        Thread.sleep(2000);

        String actualResult = driver.findElement(By.id("block-pagetitle-2")).getText();
        Assertions.assertTrue(actualResult.contains("Thank you for your submission!"));

    }

    @AfterAll
    public void tearDown(){
        driver.quit();
    }

}
