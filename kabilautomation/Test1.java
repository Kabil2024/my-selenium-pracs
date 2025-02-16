import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.codashop.com/en-in/");
        System.out.println(driver.getTitle());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
       // driver.navigate().to("https://www.codashop.com/en-in/");
        WebElement contact = driver.findElement(By.xpath("//a[@class=\"footer__contact-link\"]"));
        js.executeScript(("arguments[0].click();"),contact);
      Set<String> tab = driver.getWindowHandles();
        List<String> tabid = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabid);
        driver.switchTo().window(tabid.get(1));
        WebElement sendmsg = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/center[2]/table[1]/tbody[1]/tr[1]/td[1]/center[1]/p[1]/a[1]"));
        sendmsg.click();
        WebElement email = driver.findElement(By.xpath("//input[@name=\"request[anonymous_requester_email]\"]"));
        email.sendKeys("kabakaba");
        WebElement subject = driver.findElement(By.xpath("//input[@id='request_subject']"));
        subject.sendKeys("jhjghrjg");


    }
}