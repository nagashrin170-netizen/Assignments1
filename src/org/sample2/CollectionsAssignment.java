package org.sample2;

import java.util.HashMap;
import java.util.Map;

public class CollectionsAssignment {

	public static void main(String[] args) {
		
		        // Create the main map
		        Map<String, Map<String, String>> productData = new HashMap<>();

		        // Product 1
		        Map<String, String> product1 = new HashMap<>();
		        product1.put("Name", "Laptop");
		        product1.put("Category", "Electronics");
		        product1.put("Price", "12K Pounds");
		        product1.put("Stock Quantity", "Not Available");
		        product1.put("Supplier", "Tech Supplies");
		        product1.put("Warranty", "2 years");
		        product1.put("Rating", "4.5 Stars");
		        product1.put("Manufacturing Date", "Aug 2023");
		        product1.put("Expiry Date", "Aug 2028");
		        productData.put("P001", product1);

		        // Product 2
		        Map<String, String> product2 = new HashMap<>();
		        product2.put("Name", "Desk Chair");
		        product2.put("Category", "Furniture");
		        product2.put("Price", "150K Pounds");
		        product2.put("Stock Quantity", "Two");
		        product2.put("Supplier", "Office Depot");
		        product2.put("Warranty", "1 year");
		        product2.put("Rating", "4 Stars");
		        product2.put("Manufacturing Date", "Sep 2024");
		        product2.put("Expiry Date", "N/A");
		        productData.put("P002", product2);

		        // Product 3
		        Map<String, String> product3 = new HashMap<>();
		        product3.put("Name", "Coffee Maker");
		        product3.put("Category", "Kitchen");
		        product3.put("Price", "75 Pounds");
		        product3.put("Stock Quantity", "Two Hundred");
		        product3.put("Supplier", "KitchenWorld");
		        product3.put("Warranty", "6 months");
		        product3.put("Rating", "4.2 Stars");
		        product3.put("Manufacturing Date", "Jan 2025");
		        product3.put("Expiry Date", "Jan 2027");
		        productData.put("P003", product3);

		        // Print product details for Supplier "Office Depot"
		        for (Map.Entry<String, Map<String, String>> entry : productData.entrySet()) {
		            Map<String, String> details = entry.getValue();
		            if ("Office Depot".equals(details.get("Supplier"))) {
		                System.out.println("Product ID: " + entry.getKey());
		                for (Map.Entry<String, String> detail : details.entrySet()) {
		                    System.out.println(detail.getKey() + ": " + detail.getValue());
		                }
		                System.out.println(); // For spacing
		            }
		        }
		    }
}

