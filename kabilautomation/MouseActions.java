import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions = new Actions(driver);
       Thread.sleep(2000);
//        WebElement fashopm = driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
//        WebElement secod = driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
//      actions.moveToElement(fashopm).perform();
//
//      Thread.sleep(2000);
//      actions.moveToElement(secod).perform();
//
//        WebElement wb = driver.findElement(By.xpath("//span[text()='right click me']"));
//        actions.contextClick(wb).perform();  //to perform right click
//
//        WebElement doubleclick = driver.findElement(By.xpath("//h1"));
//        actions.doubleClick(doubleclick).doubleClick(doubleclick).perform();

        WebElement source = driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='box103']"));
        actions.dragAndDrop(source, target).perform();
        Action setup = actions.dragAndDrop(target, source).build();

        setup.perform();
    }
}
