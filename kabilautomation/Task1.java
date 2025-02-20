import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
        driver1.findElement(By.xpath("//button[@data-toggle=\"dropdown\"]")).click();
        List<WebElement> elements = driver1.findElements(By.xpath("//li//label"));
        for (WebElement ele:elements){
            if(ele.getText().equals("Java")){
                ele.click();
            }

        }
        //driver1.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        //WebElement dropdown = driver1.findElement(By.xpath("//select[@id='state']"));
//
//        Select s = new Select(dropdown);
//        s.selectByValue("Haryana");
//        s.deselectAll();

    }
}
