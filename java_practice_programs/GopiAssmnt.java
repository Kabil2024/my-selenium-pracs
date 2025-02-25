package java_practice_programs;

public class GopiAssmnt {
    public static void main(String[] args) {
        int num[] = {97, 44, 1111, 78, 100};
        int large = num[0];
        for (int z = 0; z <= 4; z++) {
            if (large < num[z]) {
                large = num[z];
            }
        }
        System.out.println("largest number in the array is: " + large);
    }
}