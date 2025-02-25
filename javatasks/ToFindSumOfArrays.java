package javatasks;

public class ToFindSumOfArrays {
    public static void main(String[] args) {
        int a[][]= {
                {23,67,9,456},
                {343,65,95},
                {23,43,7}};
                int total = 0;
//to find the sum of numbers  //a.length na andha row la ulla elemts full count panni solludhu
       for (int i =0;i<a.length;i++){

           total +=a[i].length;
       }
        System.out.println(total);

    }
}