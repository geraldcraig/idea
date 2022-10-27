package com.gerrybyrne.module11;

import java.util.Scanner;

public class ClaimDetails {

    Scanner myScanner = new Scanner(System.in);

    static String[] repairShopClaims = new String[8];
    static String repairShopID;
    static String vehiclePolicyNumber;
    static double claimAmount;
    static String claimDate;
    int numberOfClaimsBeingMade;
    static int numberOfClaimsEntered = 0;
    static int arrayPositionCounter = 0;

    static double totalofallclaims;

    static double vatamount;

    public int HowManyClaimsAreBeingMade() {
        System.out.println("How many claims are we wishing to make?\n");
        return myScanner.nextInt();
    }

    public static void CurrentValueOfCounter() {
        System.out.println("The current value of the counter is: " + numberOfClaimsEntered + "\n");
    }

    public static String ReadTheRepairShopID() {
        System.out.println("What is our repair shop id?\n");
        return myScanner.next();
    }

    public static void WriteRepairShopIdToTheArray() {
        repairShopClaims[arrayPositionCounter] = repairShopID;
        arrayPositionCounter++;
    }

    public static String ReadTheVehiclePolicyNumber() {
        System.out.println("What is the vehicle policy number?\n");
        return myScanner.next();
    }

    public static void WriteVehiclePolicyNumberToTheArray() {
        repairShopClaims[arrayPositionCounter] = vehiclePolicyNumber;
        arrayPositionCounter++;
    }

    public static double ReadTheAmountBeingClaimed() {
        System.out.println("What is the amount being claimed for the repair?\n");
        double claimAmountFromUser  = myScanner.nextDouble();

        AccumulateClaimAmount(claimAmountFromUser);

        return claimAmountFromUser;
    }

    public static void WriteClaimAmountToTheArray() {
        repairShopClaims[arrayPositionCounter] = String.valueOf(claimAmount);
        arrayPositionCounter++;
    }

    public static String ReadTheRepairDate() {
        System.out.println("What was the date of the repair?\n");
        return myScanner.next();
    }

    public static void WriteRepairDateToTheArray() {
        repairShopClaims[arrayPositionCounter] = claimDate;
        arrayPositionCounter++;
    }

    public static void DisplayAllItemsInTheArray() {
        for (String itemInTheClaimsArray : repairShopClaims) {
            System.out.println("The item in the array is:\t" + itemInTheClaimsArray + "\n");
        }
    }

    public static double AccumulateClaimAmount(double claimamountpassedin) {
        totalofallclaims = totalofallclaims + claimamountpassedin;
        return totalofallclaims;
    }

    public static double CalculateVATAmount(double totalvalueofclaimspassedin) {
        vatamount = totalvalueofclaimspassedin - (totalvalueofclaimspassedin / 1.20);
        return vatamount;
    }

    public static void DisplayInvoiceReceipt(double totalvalueofclaimspassedin, double vatPassesIn) {
        System.out.println("\nInvoice for vehicle repairs\n");
        System.out.println("Nett claim\t" + (totalofallclaims - vatamount) + "\n");
        System.out.println("VAT amount\t" + vatamount + "\n");
        System.out.println("Total amount\t" + totalofallclaims + "\n");
    }

    public static void DisplayInvoiceReceipt(double totalvalueofclaimspassedin, double vatPassesIn, String messagePassedIn) {
        System.out.println("*******************************************************");
        System.out.println("\nInvoice for vehicle repairs\n");
        System.out.println("Nett claim\t" + (totalofallclaims - vatamount) + "\n");
        System.out.println("VAT amount\t" + vatamount + "\n");
        System.out.println("Total amount\t" + totalofallclaims + "\n");
        System.out.println(messagePassedIn);
        System.out.println("*******************************************************");
    }

}
