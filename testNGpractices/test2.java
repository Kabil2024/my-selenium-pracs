package testNGpractices;

import org.testng.annotations.Test;

public class test2 {
    @Test(priority = 1)
    void tc3(){
        System.out.println("print tc3");
    }
    @Test(priority = 2)
    void tc4(){
        System.out.println("print tc4");
    }
}
