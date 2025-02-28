package java_assignments;

import java.util.Scanner;

public class CountNumberOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowels = sc.nextLine();
        int count =0;
        System.out.print("vowels in the string are : ");
        for (char vows : vowels.toLowerCase().toCharArray()){
            if (vows=='a' || vows == 'e' || vows == 'i' || vows== 'o' || vows == 'u' ){
                count++;
                System.out.print(vows + " ");
            }
        }
        System.out.println();
        System.out.println("total vowels : "+count);
    }
}
