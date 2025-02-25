package javatasks;
public class KabFile{
    public static void main(String[] args){

        // arithmetic operators
        int a = 95;
        int b = 10;
        System.out.println(a + b);
        System.out.println(a % b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a * b);

        // Relational operators
        int c = 32;
        int d = 34;
        System.out.println(c == d);
        System.out.println(c != d);
        System.out.println(c > d);
        System.out.println(c < d);
        System.out.println(c >= d);
        System.out.println(c <= d);

        // logical operators
        String username = "kabil";
        String password = "kabil2024";
        if (username == "kabil" && password == "kabil2024")
            System.out.println("Login succesfully");
        else System.out.println("invalid username or password");

        // example for invalid
        if (username == "kabil" && password == "ajay2024")
            System.out.println("Login succesfully");
        else System.out.println("invalid username or password");

        // example for " || " method
        int age = 20;
        boolean hasVoterId = true;
        if (age > 18 || !hasVoterId)
            System.out.println("you can vote only after fullfilling the requirements");
        else System.out.println("you are not eligible");

        //example for ! method
        if (hasVoterId)
            System.out.println("you must get a voter id");
        else System.out.println("you are not eligible");

        // Assignment operators
        int x = 5;
        int y = 3;
        System.out.println(y %=3); // answer will be zero (y = 3 amd whem 3 is divided by 3 the reminder will be zero)











    }
}