package java_practice_programs;

public class GopiAssmnt2 {
    public static void main(String[] args) {
        String s = "Showing 1 to 10 of 18922 (190 pages)";
        String w[] = s.split("\\(");
        for (String z : w) {
            System.out.println(w[1]);
            break;
        }
        String last[] = w[1].split("p");
        for (String ab : last) {
            System.out.println(last[0]);
            break;
        }
    }
}
