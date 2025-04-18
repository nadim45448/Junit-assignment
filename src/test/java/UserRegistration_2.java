import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserRegistration_2 {
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

    @DisplayName("Guest Registration Form")
    @Test
    public void userRegistration() throws InterruptedException {
        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
        scrollDown(driver, 500);

        driver.findElement(By.id("first_name")).sendKeys("Nadim");
        driver.findElement(By.id("last_name")).sendKeys("Hossain");
        driver.findElement(By.id("user_email")).sendKeys("nadim500@gmail.com");
        driver.findElement(By.id("radio_1665627729_Male")).click();
        driver.findElement(By.id("user_pass")).sendKeys("aA123@#$%zZ");

        String year="2024";
        String day = "08";
        driver.findElement(By.xpath("//input[@class='ur-flatpickr-field regular-text without_icon flatpickr-input']")).click();
        while(true){
            String currentYear = driver.findElement(By.className("cur-year")).getAttribute("value");

            if(currentYear.contains(year)){
                break;
            }

            driver.findElement(By.className("flatpickr-prev-month")).click();

        }
        Select dropMonth = new Select(driver.findElement(By.className("flatpickr-monthDropdown-months")));
        dropMonth.selectByVisibleText("October");
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='dayContainer']//span"));
        for(WebElement date:allDates){
            if (date.getText().contains(day)){
                date.click();
                break;
            }
        }

        scrollDown(driver, 500);
        driver.findElement(By.id("input_box_1665629217")).sendKeys("Bangladeshi");

        List<WebElement> ph = driver.findElements(By.id("phone_1665627880"));//.sendKeys("01536987452");
        ph.get(1).sendKeys("01536987452");

        Select select= new Select(driver.findElement(By.id("country_1665629257")));
        select.selectByVisibleText("Bangladesh");
        scrollDown(driver, 1300);

        driver.findElement(By.id("privacy_policy_1665633140")).click();
        Thread.sleep(2000);
        List <WebElement> submitbtns = driver.findElements(By.cssSelector("[type=submit]"));
        submitbtns.get(2).click();
        Thread.sleep(2000);

        String actuallResult = driver.findElement(By.xpath("//div[@id='ur-submit-message-node']//ul")).getText();
        Assertions.assertTrue(actuallResult.contains("User successfully registered"));
    }

    @AfterAll
    public void tearDown(){
        driver.quit();
    }

}
