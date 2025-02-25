package javatasks;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String kabil = "aj ay";
        String ajay = "kabil";
        String gokul = "kabil";
        System.out.println(ajay.length());//counts letters and spaces
        String abc= "    hello    ";
        String z = "my name is kabil";
        String efg[]={"kabil","gokul","ajay"};
        System.out.println(abc.trim());//ignores spaces(only in the starting and ending)
        System.out.println(kabil.concat(ajay));//combines two variables i.e: concatenation
        System.out.println(kabil.charAt(1));//chartAt counts from 0 as like index starts it also counts spaces as well
        System.out.println(kabil.contains("aj a"));/*contains is like a boolean method if the variable contains
                                                       the given values prints true else false*/
        System.out.println(ajay.equals(gokul));//ekuals prints true if the values are same else prints false
        System.out.println(ajay.equalsIgnoreCase(gokul));//same as ekuals but this accepts diff letters like small and caps
        System.out.println(kabil.replace("aj ay","k"));//used to replace values in the variables
        System.out.println(kabil.toUpperCase());//prints everything in caps
        System.out.println(kabil.toLowerCase());//prints everythinh in smalls
        System.out.println(Arrays.toString(abc.split("ll")));
        for (String x:efg){
            System.out.println(x);
        }
        String y = z.substring(0,5);//iykyk
        System.out.println(y);
        String x[]= z.split("is");
        System.out.println(x[0]);//prints by using array index numbers after splitting values



    }
}
