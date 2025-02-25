package java_practice_programs;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int [][] kab={
                {12,34,56,},
                {21,43,65},
                {90,78,65}
        };
        Scanner numb = new Scanner(System.in);
        int num = numb.nextByte();

        for (int i = 0;i<3;i++){
            for (int j =0;j<3;j++){

                if (num == kab[i][j]){

                }if (kab[i][j]!=-1){
                    System.out.println("found "+ num);
                }else System.out.println("nit douf");

            }
        }
    }
}