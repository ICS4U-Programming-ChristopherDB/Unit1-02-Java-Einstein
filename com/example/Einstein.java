package com.example;

import java.util.Formatter;
import java.util.Scanner;

/**
 * Calculates the energy of an object using. Einstein's equation.
 *
 * @author Christopher Di Bert
 * @version 1.0
 * @since 26-2-2024
 */

// Einstein class
public final class Einstein {

  /** Private constructor to prevent instantiation. */
  private Einstein() {
    throw new UnsupportedOperationException("Cannot instantiate");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {
    // Instantiates formatter and scanner.
    Formatter formatter = new Formatter();
    Scanner sc = new Scanner(System.in);
    // Sets speed of light constant.
    final double speedOfLight = 299792458d;
    // Greets user and asks for the mass of their object.
    System.out.println("Welcome to the energy calculator!");
    System.out.print("Enter the mass of your object (kg): ");
    try {
      // Gets the user's mass
      final double userMass = sc.nextDouble();
      // Calculates the energy of the object.
      final double energy = userMass * Math.pow(speedOfLight, 2);

      // Checks if energy is less than or equal to 0.
      if (energy <= 0) {
        System.out.println("You must enter a positive mass!");
      } else {
        System.out.print("The energy that can be released ");
        System.out.print("by the object is: ");
        double roundedNum = Double.parseDouble(String.format("%.3f", energy));
        formatter.format("%4.2e", roundedNum);
        System.out.print("The energy released by the object is: ");
        System.out.println(formatter + "J");
      }
      // Tells user tht they must not enter a string.
    } catch (Exception e) {
      System.out.println("You must enter a number!");
    }
  }
}
