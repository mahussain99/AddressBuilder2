package com.pluralsight;

import java.util.Scanner;

public class CustomerBillingInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("fullName: ");
        String fullname = scanner.nextLine();
        System.out.print("What is your billing street: ");
        String billingStreet = scanner.nextLine();
        System.out.print("What is your billing city: ");
        String billingCity = scanner.nextLine();
        System.out.print("What is your billing State: ");
        String billingState = scanner.nextLine();
        System.out.print("What is your billing Zip code:");
        String billingZipCode = scanner.nextLine();

        System.out.print("What is your shipping street: ");
        String shippingStreet = scanner.nextLine();
        System.out.print("What is your shipping city: ");
        String shippingCity = scanner.nextLine();
        System.out.print("What is your shipping State: ");
        String shippingState = scanner.nextLine();
        System.out.print("What is your billing Zip code:");
        String shippingZipCode = scanner.nextLine();

        System.out.println("============================================");

        StringBuilder shippingAddress = new StringBuilder();

        shippingAddress.append(fullname);
        shippingAddress.append(" \n \n");
        shippingAddress.append("Billing Address:");
        shippingAddress.append(" \n");
        shippingAddress.append(billingStreet);
        shippingAddress.append(" \n");
        shippingAddress.append(billingCity+ "," );
        shippingAddress.append(" ");
        shippingAddress.append(billingState);
        shippingAddress.append(" ");
        shippingAddress.append(billingZipCode);

        shippingAddress.append(" \n \n");
        shippingAddress.append("shipping Address:");
        shippingAddress.append(" \n");
        shippingAddress.append(shippingStreet);
        shippingAddress.append(" \n");
        shippingAddress.append(shippingCity+ "," );
        shippingAddress.append(" ");
        shippingAddress.append(shippingState);
        shippingAddress.append(" ");
        shippingAddress.append(shippingZipCode);

        String customerInformation = shippingAddress.toString();
        System.out.println(customerInformation);
        scanner.close();
    }
}
