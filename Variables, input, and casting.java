import java.util.Scanner;

public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt;
      double userDouble;
      char mychar;
      String mystring;
      userInt = scnr.nextInt();
      userDouble = scnr.nextDouble();
      mychar = scnr.next().charAt(0);
      mystring =scnr.next();
   int userDouble2 = (int)userDouble;
      System.out.println("Enter integer: ");
      System.out.println("Enter double: ");
      System.out.println("Enter character: ");
      System.out.println("Enter string: ");
      System.out.println(userInt + " " + userDouble + " "+ mychar +" " + mystring);
      System.out.println(mystring + " " + mychar + " " + userDouble + " " + userInt);
      System.out.println(userDouble + " cast to an integer is " + userDouble2);
      
   
   
      
      return;
   }
}