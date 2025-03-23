package testNGpractices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
    @Test(dataProvider = "data11")
    void kabil(String name, String age , String place){
        System.out.println("hello my name is "+name+" and i am "+age+" years of old and i live in "+place);
    }
    @DataProvider(name = "data11",indices = 1)
    Object[][] datasss(){
        Object[][] values = {{"kBIL","25","ramasamypuram"},
                {"ajay","23","kvs"}};
        return values;
    }


}
