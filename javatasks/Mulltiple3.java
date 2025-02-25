package javatasks;

public class Mulltiple3 implements Multiple1,Multiple2 {

    @Override
    public void one(){
        System.out.println("hello1");
    }

    @Override
    public void two() {
        System.out.println("hello2");
    }

    @Override
    public void three() {
        System.out.println("hello3");
    }

    @Override
    public void four() {
        System.out.println("hello4");
    }

    public static void main(String[] args) {
        Mulltiple3 finaL = new Mulltiple3();
        finaL.one();
        finaL.two();
        finaL.three();
        finaL.four();
        System.out.println(value1+value2);
    }
}
