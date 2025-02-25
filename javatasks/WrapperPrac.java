package javatasks;

public class WrapperPrac {
    public static void main(String[] args) throws InterruptedException {
        Object arr[] = {112, 122.0F, "sjsj", true};
        System.out.println("you can see me");

        try {
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println();
        }

        String k = "Kbil";
        Thread.sleep(1000);
        try{
            System.out.println(35/0);
        }
        catch (Exception e){
            System.out.println("exception vandutu boss");
            System.out.println(e);
        }
        Thread.sleep(200);

        System.out.println("hello ss");

        System.out.println("hello ena paka mudiyudha");
    }
}
