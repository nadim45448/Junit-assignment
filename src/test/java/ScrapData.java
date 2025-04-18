import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ScrapData {
    WebDriver driver;

    @BeforeAll
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @DisplayName("Scrap data from DSE BD")
    @Test
    public void scarpDataa() {
        driver.get("https://dsebd.org/latest_share_price_scroll_by_value.php");
        List<WebElement> allValue = driver.findElements(By.className("background-yellow"));

        int i = 0;
        String filePath = "src/test/resources/value.txt";

        try {
            FileWriter writer = new FileWriter(filePath);

            for (WebElement val : allValue) {
                i++;
                String text = "[" + i + "] " + val.getText();
                System.out.println(text);
                writer.write(text + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    public void tearDown(){
        driver.quit();
    }


}





