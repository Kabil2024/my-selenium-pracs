package javatasks;

public class SwitchCase {
  public static void main(String[] args){
      int enterRollNo = 2;
      switch (enterRollNo)
      {
          case 1:
              System.out.println("Gopi");break;
          case 2:
              System.out.println("kabil");break;
          case 3:
              System.out.println("gokul"); break;
          case 4:
              System.out.println("Ajaya"); break;
          default:
              System.out.println("invalid Roll No"); break;
      }
      int monthNo = 2;
      switch (monthNo) {
          case 1:
              System.out.println("jan");break;
          case 2:
              System.out.println("feb");break;
          case 3:
              System.out.println("mar");break;
          case 4:
              System.out.println("apr");break;
          case 5:
              System.out.println("may");break;
          case 6:
              System.out.println("june");break;
          case 7:
              System.out.println("july");break;
          case 8:
              System.out.println("aug");break;
          case 9:
              System.out.println("sep");break;
          case 10:
              System.out.println("oct");break;
          case 11:
              System.out.println("nov");break;
          case 12:
              System.out.println("dec");break;
          default:
              System.out.println("invalid month No.");
      }
      // we can aslo write in "if else staement" this is for my clarification
      int weekNo = 5;

      if (weekNo == 1) {
          System.out.println("sunday");
      } else if (weekNo == 2){
          System.out.println("monday");
      } else if (weekNo == 3) {
          System.out.println("tuesday");
     } else if (weekNo == 4) {
          System.out.println("wednesdy");
     } else if (weekNo == 5) {
          System.out.println("thursday");
     } else if (weekNo==6) {
          System.out.println("friday");
     } else if (weekNo==7) {
          System.out.println("saturday");
      }

  }
}