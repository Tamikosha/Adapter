package com.example.demo.bridge;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the model of your vehicle: ");
        final String model = scanner.next();
        System.out.print("Enter the manufacture year of your vehicle: ");
        final int manufactureYear = scanner.nextInt();

        scanner.close();

        VehicleManager vehicleManager = new VehicleManager();
        vehicleManager.vehicle = new VehicleImpl(manufactureYear, model);
        System.out.println(String.format("Your %s is %d years old !!!", vehicleManager.getModel(), vehicleManager.getAge()));
    }
}

