package java_practice_programs;

public class ReverseNumbers {
    public static void main(String[] args){
        int number = 12345;
        int reverse = 0;
        while (number > 0 ){
            int remain = number%10;

             reverse = (reverse * 10) + remain;

            number = number/10;
        }System.out.println(reverse);
    }
}
