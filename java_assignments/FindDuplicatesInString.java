package java_assignments;

import java.util.HashSet;

public class FindDuplicatesInString {
    public static void main(String[] args) {
        String letters = "aabccdeef";
        HashSet<Object> set = new HashSet<>();
        System.out.print("duplicates : ");
        for (char dup : letters.toCharArray()){
            if (!set.add(dup)){
                System.out.print(dup+" ");
            }
        }
    }
}
