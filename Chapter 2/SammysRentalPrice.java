import java.util.Scanner;

public class SammysRentalPrice {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Number of minutes rented: ");
      int minRented = scan.nextInt();
      
      System.out.println("\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS \nS Sammy's makes it fun in the sun.  S \nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      
      int hours = minRented / 60;
      int mins = minRented % 60;
      
      int hoursCost = hours * 40;
      int minsCost = mins * 1;
      int totalPrice = hoursCost + minsCost;
      
      System.out.println("\nTime: " + hours + "hours " + mins + "minutes");
      System.out.println("Total price: $" + totalPrice);
      
      
         
   }
}