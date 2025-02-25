import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        int columns=  driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println(columns);
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size() ;
        System.out.println(rows -1);
//
//        List<WebElement> lastcol = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td[4]"));
//        int sum = 0;
//        for (WebElement x : lastcol){
//            sum = sum + Integer.parseInt(x.getText());
//        }

        for (int r = 2 ; r<=rows;r++){
            for (int c = 1; c<=4;c++){
                System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText() + "\t");
            }
        }


    }
}
