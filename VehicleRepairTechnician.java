/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiclerepairtechnician;

import java.util.Scanner;

/**
 *
 * @author Confidence
 */
public class VehicleRepairTechnician {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter technician location: ");
        String location = scanner.nextLine();

        System.out.print("Enter technician name: ");
        String name = scanner.nextLine();

        System.out.print("Enter repair cost: ");
        double repairCost = scanner.nextDouble();

        System.out.print("Enter technician rate (as percentage): ");
        double technicianRate = scanner.nextDouble();

        // Validate input
        if (location.trim().isEmpty() || name.trim().isEmpty() || repairCost <= 0 || technicianRate <= 0) {
            System.out.println("Please enter valid information.");
            return;
        }

        // Calculate pay
        double pay = repairCost * (technicianRate / 100);

        // Display technician report
        System.out.println("\nTECHNICIAN REPORT");
        System.out.println("Technician Location: " + location);
        System.out.println("Technician Name: " + name);
        System.out.println("Repair Cost: R" + repairCost);
        System.out.println("Technician Rate: " + technicianRate + "%");
        System.out.println("Calculated Pay: R" + pay);
    }
}