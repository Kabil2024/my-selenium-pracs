package testNGpractices;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
    @Test(priority = 1)
    void tc1() {
        Reporter.log("");
        Reporter.log("<br><a href='kabil1250224_135456.png'> <img src='kabil1250224_135456.png' height='200' width='300'/></a><br>");
        Reporter.log("<br><a href='kabil1250224_181252.png'> <img src='kabil1250224_181252.png' height='200' width='300'/></a><br>");

        System.out.println("print tc1");
    }
    @Test(priority = 2)
    void tc2(){
        System.out.println("print tc2");
        Reporter.log("haiiiii");

    }

}
