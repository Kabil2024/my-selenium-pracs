package javatasks;

public class ReverseString {
    public static void main(String[] args) {
        String kabi = "hello guys";
        String []a= kabi.split("o");
        String reverse = "";
        for (int i = kabi.length() - 1; i >= 0; i--) {
            reverse += kabi.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(kabi.split("o"));
        System.out.println(kabi.length());
    }
}
