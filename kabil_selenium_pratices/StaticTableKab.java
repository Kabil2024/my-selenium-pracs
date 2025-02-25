import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class StaticTableKab {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        driver.get("https://demoapps.qspiders.com/ui/table");
        Thread.sleep(4000);
        List<WebElement> rows = driver.findElements(By.xpath("//tr"));
        int rowsize = rows.size();
        System.out.println(rowsize);
//        WebElement tre = driver.findElement(By.xpath("//tr[3]//td[2]"));
//        System.out.println(tre.getText());
    }
}
