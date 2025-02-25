package java_practice_programs;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner kabil = new Scanner(System.in);
        System.out.println("enter your name");
        String name = kabil.nextLine();
        System.out.println("hi "+name + " welcome to kabil calcy");
        System.out.println("enter the first number");
        int num1 = kabil.nextInt();
        System.out.println("enter the operator to calcluate ");
        char operator = kabil.next().charAt(0);
        System.out.println("enter the second number to calculate");
        int num2 = kabil.nextInt();
        switch (operator){
            case '+' :

                System.out.println("the answer is "+num1 + num2);
                System.out.println("thank you");break;
            case '-' :
                System.out.println("the answer is "+(num1 - num2));
                System.out.println("thank you");break;
            case '/' :
                System.out.println("the answer is "+num1 / num2);
                System.out.println("thank you");break;
            case '*' :
                System.out.println("the answer is "+num1 * num2);
                System.out.println("thank you");break;
            default:
                System.out.println("sorry this operator doesnot exist in my calculator soon i i will upgrade it");
        }

    }
}
