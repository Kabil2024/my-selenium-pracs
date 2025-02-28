package testNGpractices;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 extends ScreenShotPrac{
    @Test(priority = 1, groups = "kvs")
    void tc1() {
        System.out.println("print tc1");
    }

    @Test(priority = 2, groups = {"kvs","loveboys"})
    void tc2() {
        System.out.println("print tc2");
        Reporter.log("haiiiii");

    }

}
