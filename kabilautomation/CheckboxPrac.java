import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxPrac {
    public static void main(String[] args) {
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver1.manage().window().maximize();
        WebElement redbutton = driver1.findElement(By.xpath("//input[@value=\"red\"]"));
        redbutton.click();
        List<WebElement> checboxes = driver1.findElements(By.xpath("//input[@type=\"checkbox\"]"));
        System.out.println(checboxes.size());
        for (int i = 0;i <= 5;i++){
            checboxes.get(i).click();
        }
    }
}
