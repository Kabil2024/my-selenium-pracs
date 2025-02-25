package java_practice_programs;

public class WrapperPractice {
    //primitive data types = int, float,
    //String

    public static void main(String[] args) {

        String ss =  "Page 1 of 10";

//        float s = 100;
//        int s1 = 200;
//
//        //100200
//
//        System.out.println(String.valueOf(s) + String.valueOf(s1));
//
//        String ab = "12344";
//        System.out.println(Integer.parseInt(ab));
        String[] ab = ss.split("of ");
        System.out.println(ab[1]);

    }

}
