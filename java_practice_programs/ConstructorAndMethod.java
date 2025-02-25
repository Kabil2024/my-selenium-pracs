package java_practice_programs;


public class ConstructorAndMethod {
    //creating a constructor
    ConstructorAndMethod(String emp,int salary,int increment) {
        System.out.println(emp + salary + increment);
    } //creating a method
        void kabil(){
            System.out.println("hello");

    }

    public static void main(String[] args) {
        ConstructorAndMethod employee = new ConstructorAndMethod("kabil",50000,5000);
        ConstructorAndMethod employee1 = new ConstructorAndMethod("kabil123",50000,5000);
       // ConstructorAndMethod s = new ConstructorAndMethod();
        employee .kabil();
    }
}
