package java;
import java.util.Scanner;

public class algorithmExam {
   public static void main(String[] args) {
      
   Scanner keyboard = new Scanner(System.in);
   boolean isPolindrom = true;

   System.out.print("enter a number: ");
   int number = keyboard.nextInt();

   int temp = number, reverseNum = 0, lastNum;

      while(temp != 0){
         lastNum = temp % 10;
         reverseNum = reverseNum*10 + lastNum;
         temp = temp/10;
      }

      if(number == reverseNum){
         System.out.println("this number a polindrome");
         isPolindrom = true;
      }else {
         System.out.println("this nuber not polindrome number");
         isPolindrom = false;
      } 
  }
}
