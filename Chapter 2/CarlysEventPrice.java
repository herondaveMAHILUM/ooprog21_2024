import java.util.Scanner;

public class CarlysEventPrice {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Number of guests attending: ");
      int numGuests = scan.nextInt();
      
      System.out.println("*************************************** \n* Carly's makes the food that makes  * \n*           it a party.               * \n***************************************");
      
      System.out.println("Number of guests: " + numGuests);
      System.out.println("Price per guests: $35");
      
      int totalPrice = 35 * numGuests;
      
      System.out.println("Total price: $" + totalPrice);
      
      if (numGuests >= 50) {
         System.out.println("\nTrue. The job is classified as a large event");
      } else {
         System.out.println("\nFalse. The job is not classified as a large event");
      }
   }
}