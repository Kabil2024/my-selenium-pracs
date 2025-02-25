package java_practice_programs;

public class ArrayPractices1 {
    public static void main(String[] args) {
        //find the largest and smallest number

        int[] a = {323, 232, 23434, 545};
        int max = a[0];
        int min = a[0];
        int search =545;
        for (int i = 0; i<a.length;i++){
            System.out.println("the value of an element: "+i+" is "+a[i]);
        }for (int i =0;i<a.length;i++)
        if (max<a[i]){
            max = a[i];
        }for (int i = 0;i<a.length;i++)
            if (min>a[i]){
                min = a[i];
                System.out.println(min);
            }
        System.out.println(max);

            //search for an element

        for(int i =0;i<a.length;i++)
            if (search == a[i]){
search=i;
            }

        if (search!=-1){
            System.out.println("element found: "+search);
    }else System.out.println("not found");



    }
}