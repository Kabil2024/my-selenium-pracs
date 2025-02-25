package javatasks;

public class SearchElement1 {
    public static void main(String[] args) {
        String abc = "ABCD";
        char search = 'B';
        for (int i = 0;i<abc.length();i++) {
           // System.out.println(abc.charAt(i));

            if (search==abc.charAt(i)){
                System.out.println("the element found and exist in index "+i);
            }

              //  System.out.println(i);

        }
    }
}
