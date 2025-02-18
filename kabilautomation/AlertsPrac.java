import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsPrac {
    public static void main(String[] args) {
        WebDriver driver1 = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(6));
        driver1.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        WebElement alert0 = driver1.findElement(By.xpath("//button[text()=' Alerts, Frames & Windows ']"));
        JavascriptExecutor js = (JavascriptExecutor) driver1;
        js.executeScript("arguments[0].click();", alert0);
        WebElement alert = driver1.findElement(By.xpath("//a[text()=' Alerts']"));
        js.executeScript("arguments[0].click();", alert);
        WebElement alertbutton = driver1.findElement(By.xpath("//button[text()='Alert']"));
        System.out.println("first alert button is displayed : " + alertbutton.isDisplayed());
        alertbutton.click();
        Alert nalert = driver1.switchTo().alert();
        nalert.accept();
        WebElement clickme1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick=\"myMessage()\"]")));
        System.out.println("second aletrt button dislayed: " + clickme1.isDisplayed());
        clickme1.click();
        Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
        alert2.accept();

    }
}
