package java_practice_programs;

class Parent{
    void m1(){
        System.out.println("m1");
    }
}
class Child extends Parent{
    void m2(){
        System.out.println("m2");
    }
}

public class Casting {
    public static void main(String[] args) {
        Child a = new Child();
        a.m1();//can be accescible because its up casting
        a.m2();//  ,,  ,,    ,,    ,,     ,,      ,,    ,,

        Parent b = new Child();
        //b.m2 //b is parent reference so he  cannot acces child properties but child can acces parents
        //so we do down casting to acces child properties
        Child z = (Child) b;
        ((Child) b).m2();// so thus we can acces child properties by down casting
    }
}
