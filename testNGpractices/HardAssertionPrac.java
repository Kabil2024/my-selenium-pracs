package testNGpractices;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionPrac {
    @Test(groups = "A")
    void one(){
        //sa.assertTrue(5!=5);//test is failed stilll the code will run cos its soft assert
        System.out.println("one");
    }

    @Test(priority = 1, groups = "B")
    void two(){
        System.out.println("two");
        Assert.assertFalse(1>0);//it wont print next lines cos its hard assert
        System.out.println("hard");
    }
}
