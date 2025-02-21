import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingPaginationTask {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.nykaa.com/brands/the-body-shop/c/943?ptype=brand&id=943&root=brand_menu%2Ctop_brands%2CThe+Body+Shop&search_redirection=True");
        driver.manage().window().maximize();
        String[] a = driver.findElement(By.xpath("//span[contains(text(),'Page')]")).getText().split("of ");
        int totalpage = Integer.parseInt(a[1]);

        System.out.println("total pages: " + totalpage + "\n");
        //System.out.println();
        WebElement next = driver.findElement(By.xpath("//a[@class=\"css-1zi560\"]"));
        System.out.println("page no : 1 URL: " + driver.getCurrentUrl());
        System.out.println();
        for (int i = 1; i < totalpage; i++) {
            // System.out.println(page);
            js.executeScript("arguments[0].scrollIntoView(true);", next);
            wait.until(ExpectedConditions.elementToBeClickable(next));
            Thread.sleep(3000);
            js.executeScript("arguments[0].click();", next);
            System.out.println("page turned over to : " + (i + 1));
            System.out.println("page no: " + (i + 1) + " URL: " + driver.getCurrentUrl());
            System.out.println();
        }
        System.out.println("Test pass");

    }
}
