package java_assignments;

public class FIndLargestInt {
    public static void main(String[] args) {
        int[] num = {10999, 44, 55, 66, 5, 44, 66888, 788, 99};
        int large = num[0];

        int i;
        for (i = 0; i < num.length - 1; i++) {
            if (num[i] > large) {
                large = num[i];
            }

        }
        System.out.println(large);
        
    }
}