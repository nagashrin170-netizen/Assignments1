package org.sample2;

import java.util.HashMap;
import java.util.Map;

public class CollectionsAssignment {

	public static void main(String[] args) {

		       // Initialize the main map
		           Map<String, Map<String, String>> productData = new HashMap<>();

		        // Product P001
		        Map<String, String> p001 = new HashMap<>();
		        p001.put("Name", "Laptop");
		        p001.put("Category", "Electronics");
		        p001.put("Price", "12K Pounds");
		        p001.put("Stock Quantity", "Not Available");
		        p001.put("Supplier", "Tech Supplies");
		        p001.put("Warranty", "2 years");
		        p001.put("Rating", "4.5 Stars");
		        p001.put("Manufacturing Date", "Aug 2023");
		        p001.put("Expiry Date", "Aug 2028");
		        productData.put("P001", p001);

		        // Product P002
		        Map<String, String> p002 = new HashMap<>();
		        p002.put("Name", "Desk Chair");
		        p002.put("Category", "Furniture");
		        p002.put("Price", "150K Pounds");
		        p002.put("Stock Quantity", "Two");
		        p002.put("Supplier", "Office Depot");
		        p002.put("Warranty", "1 year");
		        p002.put("Rating", "4 Stars");
		        p002.put("Manufacturing Date", "Sep 2024");
		        p002.put("Expiry Date", "N/A");
		        productData.put("P002", p002);

		        // Product P003
		        Map<String, String> p003 = new HashMap<>();
		        p003.put("Name", "Coffee Maker");
		        p003.put("Category", "Kitchen");
		        p003.put("Price", "75 Pounds");
		        p003.put("Stock Quantity", "Two Hundred");
		        p003.put("Supplier", "KitchenWorld");
		        p003.put("Warranty", "6 months");
		        p003.put("Rating", "4.2 Stars");
		        p003.put("Manufacturing Date", "Jan 2025");
		        p003.put("Expiry Date", "Jan 2027");
		        productData.put("P003", p003);

		        // Directly print details for P002 (Office Depot)
		        System.out.println("Product ID: P002");
		        System.out.println("Name: " + productData.get("P002").get("Name"));
		        System.out.println("Category: " + productData.get("P002").get("Category"));
		        System.out.println("Price: " + productData.get("P002").get("Price"));
		        System.out.println("Stock Quantity: " + productData.get("P002").get("Stock Quantity"));
		        System.out.println("Supplier: " + productData.get("P002").get("Supplier"));
		        System.out.println("Warranty: " + productData.get("P002").get("Warranty"));
		        System.out.println("Rating: " + productData.get("P002").get("Rating"));
		        System.out.println("Manufacturing Date: " + productData.get("P002").get("Manufacturing Date"));
		        System.out.println("Expiry Date: " + productData.get("P002").get("Expiry Date"));
		    }
		}


