package java_assignments;

public class CountOfVowels2 {
    public static void main(String[] args) {
        String words = "kabil arasan";
        char[] letters = words.trim().toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') {
                count++;
                System.out.println(letters[i]);
            }
        }
        System.out.println(count);
    }
}
