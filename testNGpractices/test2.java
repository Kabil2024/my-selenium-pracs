package testNGpractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class test2 {
WebDriver driver;
//    @AfterMethod
//    void logout(){
//
//        System.out.println("logout");
//    }

//    @AfterTest
//    void test(){
//        System.out.println("test");
//    }
//
//    @AfterClass
//    void setupClosure(){
//        driver.quit();
//        System.out.println("after class");
//    }

//    @BeforeClass
//    void beforeSetup(){
//        driver = new ChromeDriver();
//        System.out.println("before class");
//    }




    @Test(priority = 1)
    void homeURLVerification(){
        System.out.println("print tc3");
    }

    @Test(priority = 2)
    void hometitleverification(){
        System.out.println("print tc4");
    }
//
//    @BeforeMethod
//    void login(){
//        System.out.println("login");
//    }
}
