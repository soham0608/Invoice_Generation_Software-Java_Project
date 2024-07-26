package Invoice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaxGroup {
    private static Map<String, List<String>> taxGroups = new HashMap<>();

    static {
        taxGroups.put("No Tax", new ArrayList<>());
        taxGroups.put("VAT Only", List.of("VAT"));
        taxGroups.put("SGST and CGST", List.of("SGST", "CGST"));
        // Add more tax groups internally
        taxGroups.put("Luxury Items", List.of("Luxury Tax"));
        taxGroups.put("Services", List.of("Service Tax"));
    }

    public static List<String> getTaxGroup(String groupName) {
        return taxGroups.get(groupName);
    }
}
