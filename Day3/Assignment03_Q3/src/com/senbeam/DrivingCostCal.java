package com.senbeam;

import java.util.Scanner;

public class DrivingCostCal {

	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter total miles driven per day: ");
	        double totalMilesDriven = input.nextDouble();

	        System.out.print("Enter cost per gallon of gasoline: ");
	        double costPerGallon = input.nextDouble();

	        System.out.print("Enter average miles per gallon: ");
	        double avgMilesPerGallon = input.nextDouble();

	        System.out.print("Enter parking fees per day: ");
	        double parkingFees = input.nextDouble();

	        System.out.print("Enter tolls per day: ");
	        double tolls = input.nextDouble();

	        double gasCost = (totalMilesDriven / avgMilesPerGallon) * costPerGallon;
	        double totalCost = gasCost + parkingFees + tolls;

	        System.out.println("Your daily driving cost is: $" + String.format("%.2f", totalCost));

	        
	        System.out.print("Enter the number of people in your carpool (including yourself): ");
	        int carpoolSize = input.nextInt();

	        if (carpoolSize > 1) {
	            double carpoolCost = totalCost / carpoolSize;
	            System.out.println("If you carpool with " + (carpoolSize - 1) + 
	            		" other people, your daily cost per person is: $" 
	            		+ String.format("%.2f", carpoolCost));
	            double potentialSavings = (carpoolSize - 1) * (totalCost / carpoolSize);
	            System.out.println("By carpooling, you could save: $" 
	            + String.format("%.2f", potentialSavings) + " per day.");
	        } else {
	            System.out.println("To estimate potential savings, you need at least one more person in your carpool.");
	        }

	        System.out.println("Carpooling not only saves you money but also helps reduce carbon emissions and traffic congestion. "
	        		+ "Consider carpooling for a greener and less congested commute!");

	        input.close();

	}

}

