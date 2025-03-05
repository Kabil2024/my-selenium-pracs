package java_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrangeHrmTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement inc = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
        inc.click();
       Set<String> id = driver.getWindowHandles();
        List<String> ids =new ArrayList<>(id);
       driver.switchTo().window(ids.get(1));
        WebElement dropdown = driver.findElement(By.xpath("//select[@name=\"locale\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(dropdown));
        dropdown.click();
        Select s = new Select(dropdown);
        s.selectByIndex(1);
        WebElement precos = driver.findElement(By.xpath("//a[@class=\"nav-link-hed\"and text()='Precios']"));
        precos.click();
        WebElement getprice = driver.findElement(By.xpath("//div[@id=\"testimonialCarousel\"]//following-sibling::div[@class=\"col-md-12\"]//child::a[text()='Get Pricing']"));
        js.executeScript("arguments[0].scrollIntoView(true);", getprice);
        Thread.sleep(2000);
        getprice.click();
        System.out.println("task completed");


    }
}
