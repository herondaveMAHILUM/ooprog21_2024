import java.util.Scanner;

public class AscendingAndDescending {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Input 3 Numbers");
      
      System.out.println("Num 1: ");
      int a = scan.nextInt(); 
      
      System.out.println("Num 2: ");
      int b = scan.nextInt(); 
      
      System.out.println("Num 3: ");
      int c = scan.nextInt(); 
      
      if (a < b && c > b ) {
         System.out.println("Ascending: " + a +", "+ b +", "+ c);
      } else if (a < c && b > c) {
         System.out.println("Ascending: " + a +", "+ c +", "+ b);
      } else if (b < c && a > c) {
         System.out.println("Ascending: " + b +", "+ c +", "+ a);
      } else if (b < a && c > a) {
         System.out.println("Ascending: " + b +", "+ a +", "+ c);
      } else if (c < a && b > a) {
         System.out.println("Ascending: " + c +", "+ a +", "+ b);
      } else {
         System.out.println("Ascending: " + c +", "+ b +", "+ a);
      }
   }
}