package javatasks;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner kabil = new Scanner(System.in);
        System.out.println("enter any number to chck for palindrome");
        int num1 = kabil.nextInt();
        int num2 = num1;
        int reverse = 0;
        while (num1>0){
            int digit = num1%10;
            reverse = (reverse * 10)+digit;
            num1 = num1/10;

        }
     if (reverse == num2){
         System.out.println("palindrome number");
     }else System.out.println("nt a palindrome");
    }
}