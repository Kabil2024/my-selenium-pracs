package java_assignments;

public class Factorial {
public static void main(String[] args){
    int factorsOfNum = 5;
    int start = 1;
    int factor = 1;
    while(start <= factorsOfNum){
        factor = factor*start;
        start++;
    }
    System.out.println(factor);
}
}
