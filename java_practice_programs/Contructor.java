package java_practice_programs;

public class

Contructor {
    int employee;
    int hr;
    int security;
    String name;
    String fathername;

    Contructor(int emp, int humanR, int protector) {

        employee = emp;
        hr = humanR;
        security = protector;
        System.out.println("there are " + employee + " employees " + hr + " members in hr dept " + " and " + security + " securities");
    }

    Contructor(String me, String father, int sec) {
        name = me;
        fathername = father;
        security = sec;
        System.out.println(name + " " + fathername + " " + security);
    }

    public static void main(String[] args) {
        Contructor Toku = new Contructor(25, 10, 5);
        Contructor toku1 = new Contructor("kabil", "kabildad", 66);

    }
}
