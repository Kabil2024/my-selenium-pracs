import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class EnablingExtensions {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        File file = new File("C:\\Users\\barath\\Downloads\\CRX files\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
        options.addExtensions(file);
        WebDriver driver1 = new ChromeDriver(options);
        driver1.get("https://www.flipkart.com/");


    }
}
