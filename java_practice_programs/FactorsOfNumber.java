package java_practice_programs;

import java.util.Scanner;

public class FactorsOfNumber{
    public static void main(String[] args){
        Scanner kabil = new Scanner(System.in);
        System.out.println("enter the number for factor");
        int num1 = kabil.nextInt();
        int i = 1;
        int factor = 1;
        while (i<=num1){
            factor = factor*i;
            i++;

        }
        System.out.println("factor of 5 number is " + factor);
    }

}