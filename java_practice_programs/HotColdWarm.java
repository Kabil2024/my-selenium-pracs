package java_practice_programs;

public class HotColdWarm {
    public static void main(String[] args){

        int degree = 45;
        if (degree >= 30){
            System.out.println("Hot");
        } else if (degree <= 15 ) {
            System.out.println("Cold");
        } else if (degree <= 30 && degree >= 15) {
            System.out.println("warm");
        }
    }
}
