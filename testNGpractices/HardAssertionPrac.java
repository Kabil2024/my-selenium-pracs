package testNGpractices;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionPrac {
    @Test(groups = "A")
    void one(){
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(5<5);//test is failed stilll the code will run cos its soft assert
        System.out.println("one");
        sa.assertAll();
    }

    @Test(priority = 1, groups = "B")
    void two(){
        System.out.println("two");
        Assert.assertFalse(1>0);//it wont print next lines cos its hard assert
        System.out.println("hard");
    }
    @Test
    void Three(){
                int x =123;
                int reverse = 0;
                while(x == 0){
                    int digit = x %10;
                    reverse = (reverse * 10)+digit;
                    x = x/10;
                System.out.println(reverse);

        }
    }
}
