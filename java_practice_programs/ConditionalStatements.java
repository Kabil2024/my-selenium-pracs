package java_practice_programs;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to check for even or odd number");
        int a = scanner.nextInt();
        if ( a %2==0 ){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");

        }

        //grading system
        System.out.println("please enter your marks for the result");
        int mark = scanner.nextInt();
        if (mark  > 35){
            System.out.println("pass");
        } else if (mark < 35) {
            System.out.println("fail");
        } else if (mark == 35) {
            System.out.println("just pass");
        }
        //switch case
        System.out.println("please enter the month number");
    int month = scanner.nextInt();
        switch (month){
            case 1 :
                System.out.println("jan");break;
            case 2 :
                System.out.println("feb");break;
            case 3 :
                System.out.println("mar");break;
            case 4 :
                System.out.println("apr");break;
            default:
                System.out.println("invalid month");
        }
        //for loop
        int kabil = scanner.nextInt();
        for (kabil =1; kabil <= 10; kabil++)
        if (kabil==3)break;
            System.out.println(kabil);

    }
}
