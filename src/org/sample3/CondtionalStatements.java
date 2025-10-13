package org.sample3;

public class CondtionalStatements {

	public static void main(String[] args) {

		        // Customer details
		        String customerName = "John Doe";
		        int creditScore = 720;
		        double income = 55000.0;
		        boolean isEmployed = true;
		        double debtToIncomeRatio = 35.0;

		        boolean isEligible = false;

		        // Step 1: Credit Score check
		        if (creditScore > 750) {
		            // Automatically approved
		            isEligible = true;
		        } else if (creditScore >= 650 && creditScore <= 750) {
		            // Step 2: Income check
		            if (income >= 50000) {
		                // Step 3: Employment status check
		                if (isEmployed) {
		                    // Step 4: Debt-to-Income ratio check
		                    if (debtToIncomeRatio < 40) {
		                        isEligible = true;
		                    } else {
		                        isEligible = false; // DTI too high
		                    }
		                } else {
		                    isEligible = false; // Not employed
		                }
		            } else {
		                isEligible = false; // Income too low
		            }
		        } else {
		            isEligible = false; // Credit score < 650
		        }

		        // Step 5: Print result
		        if (isEligible) {
		            System.out.println(customerName + " is eligible for the loan.");
		        } else {
		            System.out.println(customerName + " is not eligible for the loan.");
		        }
		    }
		}
