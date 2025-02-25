package javatasks;

import java.util.Scanner;

public class CheckPositiveOrNegativeNumber {
    public static void main(String[] args){
        Scanner kabi= new Scanner(System.in);
        System.out.println("enter number");
        int number = kabi.nextInt();
        if (number <0){
            System.out.println("the number: "+kabi+ " is negative");
        } else if (number>0) {
            System.out.println("the number: "+kabi+ " is positive");

        }else System.out.println("the number is: "+ kabi);

    }
}