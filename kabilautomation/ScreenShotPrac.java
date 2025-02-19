import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotPrac {


    void photo(WebDriver driver) {
        String timestamp = new SimpleDateFormat("yyMMdd_HHmmss").format(new Date());

        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        File targetfile = new File(System.getProperty("user.dir") + "//screen//kabil1"+timestamp+".png");
        sourcefile.renameTo(targetfile);
        System.out.println(targetfile);
    }

//    void specificpic(WebElement ab) {
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File sourcefile = ab.getScreenshotAs(OutputType.FILE);
//        File targetfile = new File(System.getProperty("user.dir") + "//kabil" + timestamp + ".png");
//        sourcefile.renameTo(targetfile);
//        System.out.println(targetfile);


    public static void main(String[] args) {
        ScreenShotPrac obj = new ScreenShotPrac();
       // String timestamp = new SimpleDateFormat("yyyMMdd_HHmmss").format(new Date());

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
      //  WebElement speci = driver.findElement(By.xpath("//div[@class=\"_3bzdSa\"]"));
        // driver.manage().window().maximize();
        obj.photo(driver);


    }}
