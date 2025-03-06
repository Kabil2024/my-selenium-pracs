package java_assignments;

import java.util.HashSet;

public class FindDuplicates2 {
    public static void main(String[] args) {
        String name = "kabilarsan";
        HashSet<Object> set = new HashSet<>();
        System.out.print("duplicates are : ");
        for (char x : name.toCharArray()){
            if (!set.add(x)){
                System.out.print(x+" ");
            }
        }
    }
}
