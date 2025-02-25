package java_assignments;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] num = {11, 22, 33, 44, 55, 66};
        int temp = 0;
        for (int i = 0;i< num.length;i++){
            for (int j = i+1 ;j< num.length;j++){
                if (num[i]>num[j]){
                    temp = num[j];
                    num[j]= num[i];
                    num[i]= temp;
                }
            }
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("second largest num in a array : "+num[num.length-2]);
    }
}
