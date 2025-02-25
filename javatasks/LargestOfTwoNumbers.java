package javatasks;

public class LargestOfTwoNumbers {
    public static void main(String[] args){

        int a = 25;
        int b = 55;
        if ( a > b ) {
            System.out.println("largest number is a");
        } else System.out.println("largest number is b");

        int c = 40;
        int d = 30;
        int e = 50;
        if (c > d && c > e){
            System.out.println("largest number is c");
        } else if (d > c && d > e) {
            System.out.println("largest number is d");
        } else if (e > d && e > c) {
            System.out.println("largest number is e");

        }

    }
}
