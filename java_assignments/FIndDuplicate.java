package java_assignments;

import java.util.HashSet;

public class FIndDuplicate {
    public static void main(String[] args) {
        String word = "kabilarasan";
        HashSet<Object> set = new HashSet<>();
      for (char dup : word.toCharArray()){
          if (!set.add(dup)){
              System.out.println(dup+" ");
          }

      }
    }
}
