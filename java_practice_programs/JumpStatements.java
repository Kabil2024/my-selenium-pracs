package java_practice_programs;

public class JumpStatements {
    public static void main(String[] args){
        for (int a = 1;a <= 10;a++ ){
            if (a==3) {
                continue;
            }
            System.out.println(a);
        }
        //next
        int a = 1,b= 2 ,c = 4;
        if (a>b && a>c){
            System.out.println("a is a bigger nnumber");
        } else if (b>a && b>c) {
            System.out.println("b is a bigger number");
        }else System.out.println("c is greater");


    }
}
