package jour01.job08;

public class Invoice {
    double price = 49.99;
    int quantity = 3;
    double priceWithouTax;
    int tax = 20;
    double priceWithTax;
    double taxAmount;

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.priceWithouTax = invoice.price * invoice.quantity;
        invoice.priceWithTax = invoice.priceWithouTax + (invoice.priceWithouTax * invoice.tax / 100);
        invoice.taxAmount = invoice.priceWithouTax * invoice.tax / 100;
        
        System.out.println("Total price without tax: " + invoice.priceWithouTax);
        System.out.println("Tax amount: " + invoice.taxAmount);
        System.out.println("Total price with tax: " + invoice.priceWithTax);
    }
}
