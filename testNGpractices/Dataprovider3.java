package testNGpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dataprovider3 {
    WebDriver driver;
    @BeforeClass
    void setup (){
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }
    @Test(dataProvider = "data1")
    void datapro(String user, String pass) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
        try {
            WebElement logincnfm = driver.findElement(By.xpath("//a[text()='Log out']"));
            Assert.assertTrue(logincnfm.isDisplayed());
            System.out.println("test pass with Usrname: "+user+"      Pass: "+pass);
            logincnfm.click();
        } catch (Exception e) {
            System.out.println("test fail with Username: "+user+"     Pass: "+pass);
            Assert.fail();

        }

    }

    @DataProvider(name = "data1")
    Object[][] data() {
        Object[][] datssss = {
                {"student", "Password123"},
                {"efsfsfw", "fefefwefew"}
        };
        return datssss;
    }
    @AfterClass
    void end(){
        driver.quit();
    }
}
