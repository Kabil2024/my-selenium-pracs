package javatasks;

public class WhileLoopAssmnts {
    public static void main(String[] args ){
        //print numbers from one to ten
        int a = 1;
        while (a <=10){
            System.out.println(a);
            a++;
        }

        //calculate the sum of  1 to 50 numbers
        int a1 = 1;
       int sum = 0;
       while (a1 <= 50){
         sum = sum + a1;
           a1++;
       }System.out.println("the sum of 50 numbers is: " +sum);

       //print all even numbers from 1 to 50
        int a2 = 0;
        while (a2 < 50){
           a2+=2;
            System.out.println(a2);
        }
        //reverse counting from 1 to 10
        int a3 = 50;
        while (a3 > 1){
            a3--;
            System.out.println(a3);
        }
        //find the factorial of 5 numbers
        int a4 = 5;//this variable is to put condition
        int i = 1;//this for increment
        int ab = 1;
        while (i <= a4){
        ab = i * ab ;
        i++;
        }
        System.out.println("the sum of "+ a4 +" = "+ ab);
        //multiplication of 10 table
        int a5 = 10;
        int j = 1;
        int sum2 = 1;
        while (j <=10){
            sum2 = j * a5;
            System.out.println(a5+" x " +j +" = "+sum2);
            j++;
            //pandroline numbers




        }



    }
}
