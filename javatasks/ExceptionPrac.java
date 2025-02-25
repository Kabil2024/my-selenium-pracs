package javatasks;

public class ExceptionPrac {
    public static void main(String[] args) {
        String a = "kabil";
        //example for unchecked errors and this can be handled using try catch and throw
        try {
            System.out.println(Integer.parseInt(a));
        } catch (Exception e) {
            System.out.println("error in line 9");
            System.out.println(e);
        }
        System.out.println("hello");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("heloooo");
        try {
            System.out.println(2 / 0);
        } catch (Exception e){
            System.out.println("error");
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
