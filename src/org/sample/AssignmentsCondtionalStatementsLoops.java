package org.sample;
import java.util.LinkedHashMap;
import java.util.Map;

public class AssignmentsCondtionalStatementsLoops {


	    public static void main(String[] args) {
	        // Step 1: Employee data
	        String[] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
	        double[] baseSalary = {75000.0, 68000.0, 82000.0, 90000.0, 60000.0};
	        double[] experience = {5.1, 3.2, 7.1, 10.2, 2.4};
	        double[] rating = {4.2, 3.8, 4.5, 2.5, 3.5};

	        // Step 2: Map to store Employee name -> Hike Percentage
	        Map<String, Double> hikePercentages = new LinkedHashMap<>();

	        // Step 3: Iterate over all employees
	        for (int i = 0; i < names.length; i++) {
	            double variablePayPercent;
	            double bonus;

	            // Step 4: Determine variable pay % and bonus based on rating
	            if (rating[i] >= 4.0) {
	                variablePayPercent = 15.0;
	                bonus = 1500;
	            } else if (rating[i] >= 3.0 && rating[i] < 4.0) {
	                variablePayPercent = 10.0;
	                bonus = 1200;
	            } else {
	                variablePayPercent = 3.0;
	                bonus = 300;
	            }

	            // Step 5: Reward for experience >= 5 years
	            double reward = (experience[i] >= 5.0) ? 5000 : 0;

	            // Step 6: Calculate total hike value
	            double hikeValue = (baseSalary[i] * (variablePayPercent / 100)) + bonus + reward;

	            // Step 7: Calculate hike percentage
	            double hikePercent = (hikeValue / baseSalary[i]) * 100;

	            // Step 8: Store in map
	            hikePercentages.put(names[i], hikePercent);
	        }

	        // Step 9: Print results
	        System.out.println("Employee Hike Percentages:");
	        for (Map.Entry<String, Double> entry : hikePercentages.entrySet()) {
	            System.out.printf("%s : %.2f%%\n", entry.getKey(), entry.getValue());
	        }
	    }
	}

