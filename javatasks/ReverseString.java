package javatasks;

public class ReverseString {
    public static void main(String[] args){
        String alpha = "LIBAK";
        int i;
        String reverse = "";
        int size = alpha.length();
       for( i = size-1 ; i >= 0; i--){
           reverse = reverse+alpha.charAt(i);
       }           System.out.println(reverse);
    }
}
