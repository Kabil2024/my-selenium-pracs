package java_assignments;

public class FIndSecondLarge {
    public static void main(String[] args) {
        int num [] = {22,66,5,88,66,0};
        int temp = 0;
        int i;
        for ( i = 0 ;i< num.length-1;i++){
            for (int j=i+1;j<num.length-1;j++){
                if (num[i]>num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println(num[num.length-2]);
    }
}
