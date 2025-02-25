package java_practice_programs;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner kabil = new Scanner(System.in);
    int num = kabil.nextInt();
    if (num%num==0 && num%1==0 && num>1){
        System.out.println("the number is prime");
    } else if (num ==1) {
        System.out.println("1 is a distinct factor");

    } else System.out.println("the number is composite");
}}
