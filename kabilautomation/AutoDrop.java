import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@name='q']")).click();
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
        Thread.sleep(500);
        List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        System.out.println(options.size());
        for (WebElement o:options){
            System.out.println(o.getText());
            if(o.getText().equals("Selenium java")){
                o.click();
            }
        }
    }
}
