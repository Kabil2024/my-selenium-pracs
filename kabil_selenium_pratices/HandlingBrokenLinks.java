import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class HandlingBrokenLinks {
    public static void main(String[] args)  {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://www.deadlinkcity.com/");
        List<WebElement> allLink = driver.findElements(By.xpath("//a[@href]"));
        int brkenlinks = 0;
        for (WebElement links : allLink) {
            String values = links.getAttribute("href");
            if (values.isEmpty() || values==null) {
                System.out.println("the link is not possible to return status code");
                continue;
            }
            //convert string to url to send the link to server
            try {
                URL urlLink = new URL(values);

                HttpURLConnection connection = (HttpURLConnection) urlLink.openConnection();
                connection.connect();
                if (connection.getResponseCode() >= 400) {
                    System.out.println(values+"---broken link---"+connection.getResponseCode());
                    brkenlinks++;

                } else {
                    System.out.println(values+" not a broken link");
                }
            } catch (Exception e) {
                System.out.println("--"+e);;
            }
        }
        System.out.println("no. of broken links: "+ brkenlinks);
        System.out.println(allLink.size());



    }
}