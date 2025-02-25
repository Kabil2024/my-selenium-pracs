package javatasks;

public class practices {
    public static void main(String [] args){
        int a = 30;
        int b = 45;
        int c = 0;
        c = a;
        a = b;
        b = c;

        System.out.println("after swapping  a = "+a);
        System.out.println("                b = "+b);
        //now without using third variable
        int a1 = 40;
        int a2 = 60;
        a1 = a2 +  a1;
        a2 = a1 - a2;
        a1 = a1 - a2;
        System.out.println("after swapping a = "+ a1);
        System.out.println("and            b = "+ a2);
        //reversing numbers
        int num = 1234;
        int reverse = 0;

        while (num > 0){
           int digit= num%10;
            reverse = (reverse * 10) +digit;
            num = num/10;
        }
        System.out.println(reverse);

        int num2 = 6789;
       int reverse1 = 0;
       while (num2 > 0){
           int remain1 = num2%10;
           reverse1 = (reverse1 * 10)+ remain1;
           num2 =num2/10;

       } System.out.println(reverse1);

    }
}
