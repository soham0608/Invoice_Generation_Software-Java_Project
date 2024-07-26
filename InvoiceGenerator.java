package Invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceGenerator {

    public static void generateInvoice(List<String> purchasedProducts) {
        double totalPrice = 0;
        double totalTax = 0;

        System.out.println("-----------------------------");

        for (String productName : purchasedProducts) {
            ProductDetails product = Product.getProductDetails(productName);
            if (product == null) {
                System.out.println("Product " + productName + " not found.");
                continue;
            }
            double price = product.getPrice();
            String taxGroup = product.getTaxGroup();

            double taxAmount = 0;
            for (String tax : TaxGroup.getTaxGroup(taxGroup)) {
                taxAmount += price * Tax.getTaxPercentage(tax);
            }

            System.out.println(productName + "     " + price + " " + Math.round(taxAmount * 100.0) / 100.0);

            totalPrice += price;
            totalTax += taxAmount;
        }

        double grandTotal = totalPrice + totalTax;

        System.out.println("Total         " + totalPrice + " " + Math.round(totalTax * 100.0) / 100.0);
        System.out.println("Grand Total  : " + Math.round(grandTotal * 100.0) / 100.0);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> purchasedProducts = new ArrayList<>();
        System.out.println("Select purchased products (type 'done' to finish):");
        while (true) {
            System.out.print("Enter product name: ");
            String productName = scanner.nextLine().trim();
            if (productName.equalsIgnoreCase("done")) break;
            purchasedProducts.add(productName);
        }

        generateInvoice(purchasedProducts);

        scanner.close();
    }
}

