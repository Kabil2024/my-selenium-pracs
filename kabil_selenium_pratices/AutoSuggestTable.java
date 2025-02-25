import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search.sendKeys("tuticorin");
        Thread.sleep(4000);
        List<WebElement> options = driver.findElements(By.xpath("//li[@data-view-type='1'] [@jsaction=\"click:.CLIENT;mouseover:.CLIENT\"]"));
        options.size();
        for (WebElement tuti : options) {
            System.out.println(tuti.getText());
            Thread.sleep(2000);
            if (tuti.getText().equals("tuticorin to chennai flight")){
                tuti.click();
            }
        }

    }
}
