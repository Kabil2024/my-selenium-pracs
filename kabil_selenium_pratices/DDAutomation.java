import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class DDAutomation {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://practice.expandtesting.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String filepath = System.getProperty("user.dir") + "//testdata//kabi.xlsx";
        int rows = ExcelUtility.getrowcount(filepath, "Sheet1");

        //WebElement logbut = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        // WebElement invalid = driver.findElement(By.xpath("//b[contains(text(),\"invalid!\")]"));


        System.out.println(rows + "-");
        for (int i = 0; i <= rows; i++) {
            WebElement userinput = driver.findElement(By.xpath("//input[@id=\"username\"]"));
            WebElement passinput = driver.findElement(By.xpath("//input[@id=\"password\"]"));
            WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
            String Userdata = ExcelUtility.getcelldata(filepath, "Sheet1", i, 0);
            String passdata = ExcelUtility.getcelldata(filepath, "Sheet1", i, 1);
            // String expresult = ExcelUtility.getcelldata(filepath, "Shhet1", i, 0);
            //js.executeScript("arguments[0].scrollIntoView(true);", userinput);
            Thread.sleep(3000);
            userinput.clear();
            passinput.clear();
            userinput.sendKeys(Userdata);
            passinput.sendKeys(passdata);
            Thread.sleep(2000);
            js.executeScript("arguments[0].click();", login);
            //login.click();
            int valid = driver.findElements(By.xpath("//i[text()=' Logout']")).size();
            if (valid > 0) {
                System.out.println("test pass");
                ExcelUtility.setcelldata(filepath, "Sheet1", i, 2, "pass");
                //  driver.findElement(By.xpath("//i[text()=' Logout']")).click();
                driver.navigate().back();
            } else {
                System.out.println("test fail");
                ExcelUtility.setcelldata(filepath, "Sheet1", i, 2, "fail");
            }


        }


    }
}
