package javatasks;

public class SumOfNaturalNos {
    public static void main (String [] args) {
        int N = 1;
        int sum = 0;
        while (N <= 10){
            sum = sum + N;
            N++;
        }
        System.out.println("the sum of first 10 natural numbers is " + sum);
    }
}
