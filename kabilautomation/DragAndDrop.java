import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
//        WebElement DD = driver.findElement(By.xpath("//span[@class='link_span'][normalize-space()='Drag And Drop']"));
//        DD.click();
        WebElement iframe =driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
        driver.switchTo().frame(iframe);
        WebElement img1 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
        Actions drag = new Actions(driver);
        drag.dragAndDrop(img1, target).perform();


    }
}
