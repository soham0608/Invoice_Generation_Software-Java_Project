package Invoice;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private static Map<String, ProductDetails> products = new HashMap<>();

    static {
        products.put("Rice", new ProductDetails(40, "No Tax"));
        products.put("Petrol", new ProductDetails(65, "VAT Only"));
        products.put("Soap", new ProductDetails(10, "SGST and CGST"));
        products.put("Luxury Car", new ProductDetails(50000, "Luxury Items"));
        products.put("Consulting Service", new ProductDetails(200, "Services"));
        products.put("Milk", new ProductDetails(30, "No Tax"));
        products.put("Laptop", new ProductDetails(60000, "VAT Only"));
        products.put("Chair", new ProductDetails(1200, "SGST and CGST"));
    }

    public static ProductDetails getProductDetails(String productName) {
        return products.get(productName);
    }
}
