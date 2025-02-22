import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://material.angularjs.org/latest/demo/input");
        WebElement a = driver.findElement(By.xpath("//input[@id=\"input_65\"]"));
        actions.click(a).doubleClick().perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        WebElement b = driver.findElement(By.xpath("//input[@id=\"input_70\"]"));
        actions.click(b).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

    }
}
