package java_assignments;

public class task {
    public static void main(String[] args) {
        String word = "kabil";
        char[] ch = word.toCharArray();
        String r = "";
        System.out.print("String reverse : ");
        for (int i = word.length()-1;i >= 0;i--){
            System.out.print(ch[i]);
    }
        String words = "hai i am kabil";
        String []a = words.split(" ");
        String reverse = "";
        System.out.println();
        for (int j = a.length-1;j >=0;j--){
         //  reverse = reverse+a[j];
            System.out.print(a[j] + " ");
        }
}}