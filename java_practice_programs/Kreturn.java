package java_practice_programs;

public class Kreturn {
    void noParameterNoReturn() {
        System.out.println("hi i am kabil");
    }

    void parameterNoReturm(String name) {
        System.out.println("hi my name is " + name);
    }

    String parameterReturn(String namee, int age, float heigt) {
        return ("my name is " + namee + "age : " + age + "height: " + heigt);
    }

    int NoparameterReturn() {
        return 100;
    }

    void ifMethod(String peyar) {
        if (peyar == "arasan") {
            System.out.println("good boy");
        } else if (peyar == "ajay") {
            System.out.println("play boy");
        } else if (peyar == "gokul") {
            System.out.println("smart boy");
        } else System.out.println("enter valid name");
    }

    public static void main(String[] args) {
        Kreturn kabil = new Kreturn();
        kabil.noParameterNoReturn();           //`executed method 1
        kabil.parameterNoReturm("kabil");//method 2 executed
        String abc = kabil.parameterReturn("kabil ", 25, 169.7f);
        System.out.println(abc);               //method 3 executed
        int a = kabil.NoparameterReturn();
        System.out.println(a);                 //method 4 executed
        kabil.ifMethod("arasan");


    }
}