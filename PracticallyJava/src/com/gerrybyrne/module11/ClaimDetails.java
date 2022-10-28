package com.gerrybyrne.module11;

import java.util.Scanner;

public class ClaimDetails {

    Scanner myScanner = new Scanner(System.in);

    int numberOfClaimsBeingMade;

    public int HowManyClaimsAreBeingMade() {
        System.out.println("How many claims are we wishing to make?\n");
        return myScanner.nextInt();
    }

}
