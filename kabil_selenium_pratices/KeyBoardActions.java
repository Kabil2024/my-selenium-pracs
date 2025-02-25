import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class KeyBoardActions {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://material.angularjs.org/latest/demo/input");
        WebElement a = driver.findElement(By.xpath("//input[@id=\"input_65\"]"));
        actions.click(a).doubleClick().perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        WebElement b = driver.findElement(By.xpath("//input[@id=\"input_70\"]"));
        actions.click(b).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        Thread.sleep(2000);
        WebElement newtab = driver.findElement(By.xpath("//a[text()='Long Term Support']"));
        actions.keyDown(Keys.CONTROL).click(newtab).keyUp(Keys.CONTROL).perform();
        Set<String> ids = driver.getWindowHandles();
        ArrayList<String> windowlist = new ArrayList<>(ids);
        driver.switchTo().window(windowlist.get(1));
        WebElement select = driver.findElement(By.xpath("//select[@ng-model=\"$ctrl.selectedVersion\"]"));
        select.click();
    }
}