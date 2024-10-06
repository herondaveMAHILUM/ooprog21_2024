public class Billing {

    public double computeBill(double price) {
        double total = price + (price * 0.08);
        return total;
    }
    
    public double computeBill(double price, int quantity) {
        double total = (price * quantity) + (price * quantity * 0.08);
        return total;
    }
    
    public double computeBill(double price, int quantity, int discount) {
        double total = (price * quantity) - discount;
        total = total + (total * 0.08); // Adds 8% tax after discount
        return total;
    }

    public static void main(String[] args) {
        Billing billing = new Billing();

        System.out.println("The total price for the bill is: $" + billing.computeBill(23.2));
        System.out.println("The total price for the bill is: $" + billing.computeBill(23.2, 2));
        System.out.println("The total price for the bill is: $" + billing.computeBill(23.2, 3, 10));
    }
}
