package org.sample;

public class ArraysDatatypesAssignment {

	public static void main(String[] args) {
		
		        // Step 1: Initialize arrays
		        String[] studentNames = {"Suresh", "Mahesh", "Naresh"};
		        int[] marks = {75, 80, 82};

		        // Step 2: Create another array to store updated marks
		        int[] updatedMarks = new int[marks.length];
		        int total = 0;

		        // Step 3: Add 10 marks using assignment operator
		        for (int i = 0; i < marks.length; i++) {
		            updatedMarks[i] = marks[i] + 10;
		            total += updatedMarks[i];
		        }

		        // Step 4: Calculate average
		        double average = (double) total / updatedMarks.length;

		        // Step 5: Print updated marks and average
		        System.out.println("Updated Marks:");
		        for (int i = 0; i < studentNames.length; i++) {
		            System.out.println(studentNames[i] + ": " + updatedMarks[i]);
		        }

		        System.out.println("Average Marks: " + average);
		    }
}

