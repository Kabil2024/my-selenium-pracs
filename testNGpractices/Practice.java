package testNGpractices;

import org.testng.annotations.Test;

public class Practice {
    @Test void reverseString(){
        String word = "kabil";
        char ch[] = word.toCharArray();
        for (int i = word.length()-1;i == 0;i--){
            System.out.println(ch);
        }
    }
}
