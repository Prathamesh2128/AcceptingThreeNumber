package com.app;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("The largest number is: " + largest);

        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average of the three numbers is: " + average);

        scanner.close();
	}
}
