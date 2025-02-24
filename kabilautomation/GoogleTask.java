import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GoogleTask {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileInputStream propertyfile = new FileInputStream(System.getProperty("user.dir") + "//properties//google.properties");
        Properties propobj = new Properties();
        WebDriver driver = new ChromeDriver();
        propobj.load(propertyfile);
        String url = propobj.getProperty("url");
        String filepath = System.getProperty("user.dir") + "//testdata//google.xlsx";
        System.out.println(url);
        driver.get(url);
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]"));
        int rows = ExcelUtility.getrowcount(filepath, "Sheet1");
        for (int i = 0; i <= rows; i++) {
            String serachinputdata = ExcelUtility.getcelldata(filepath, "Sheet1", i, 0);
            search.sendKeys(serachinputdata);
            Thread.sleep(2000);
            ScreenShotPrac ss = new ScreenShotPrac();
            ss.photo(driver);
            search.clear();

        }

    }
}
