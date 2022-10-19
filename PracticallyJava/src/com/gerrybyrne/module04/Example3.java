/*
The package is simply an area that holds our class.
This package has used the . to separate sections of the package name.
The parts essentially represent folders within our project.
Package names are by tradition all small letters.
*/

package com.gerrybyrne.module04;

// Program Description:  A simple Java program to output text and read input
// Author:               Gerry Byrne
// Date of creation:     19/10/2022


import java.util.Scanner;

// This is our only class, and it will contain the Main method
public class Example3 {

    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
    /*
    In this section we will add the variables we will use throughout the program
    code. These are variables that are going to be of a specific data type. Once
    we declare a variable and have said what its data type is, we cannot change
    the variables data type.

    The data type is immutable, it cannot be changed over time. First we will add
    a variable called vehicleManufacturer of data type string.
     */
     String vehicleManufacturer;

     System.out.println();
     System.out.println("------- Car Quotation Application -------");
     System.out.println("\tCar\tInsurance\tApplication\n");
     System.out.println();
     System.out.println("Type the vehicle manufacturer and press the enter key");
     System.out.println();

     /*
     The next line of code tells the program to wait for the user to input something.
     When the user
     */
     vehicleManufacturer = myScanner.next();

     /*
     The next line of code tells
     */

     System.out.println("Your car manufacturer is recorded as " + vehicleManufacturer);

     System.out.println();

     myScanner.close();
    } // End of main() method
} // End of Example3 class


