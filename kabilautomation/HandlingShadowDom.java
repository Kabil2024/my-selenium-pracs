import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingShadowDom {
    public static void main(String [] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
       SearchContext host =  driver.findElement(By.cssSelector(".smart-ui-component")).getShadowRoot();
       Thread.sleep(2000);
        host.findElement(By.cssSelector("smart-menu:nth-child(1) > div:nth-child(1) > div:nth-child(3) > smart-menu-items-group:nth-child(1) > div:nth-child(1)")).click();

    }
}
