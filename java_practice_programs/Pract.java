package java_practice_programs;

interface Tiger {
    int a = 100; //final static variables
    //abstract methods, default method, static methods

    static void print() {
        System.out.println("inside static method");
    }

    default void display() {
        System.out.println("inside default method");
    }

    public void dance(int a);

}

interface Lion extends Tiger {
    void waste();
}

public class Pract implements Lion {
    public void dance(int a) {
        System.out.println("sgshhs");
    }

    public void waste() {
        System.out.println("inw wastwe ");
    }

    void liger() {
        System.out.println("in liger");
    }

    public static void main(String args[]) {
        Tiger t  = new Pract();
        t.dance(9);
        t.display();
        Tiger.print();
        System.out.println(Tiger.a);
        Pract p = new Pract();
        p.display();
        Tiger.print();
        p.liger();
        p.waste();
        System.out.println(Tiger.a);

    }
}

//final static variables


