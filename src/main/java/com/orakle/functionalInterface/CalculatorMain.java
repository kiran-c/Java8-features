package com.orakle.functionalInterface;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st Number");
		Double v1 = sc.nextDouble();

		System.out.println("Enter the 2nd Number");
		Double v2 = sc.nextDouble();

		System.out.println("Enter 1 - add, 2- Substract, 3 - multiply, 4 - Division, 5 - Modulas ");
		Integer choice = sc.nextInt();

		CalculatorInterface ci = null;
		Double res = null;

		switch (choice) {
		case 1:

			ci = (Double var1, Double var2) -> {

				return v1 + v2;
			};

			res = ci.operation(v1, v2);
			break;

		case 2:
			ci = (Double var1, Double var2) -> {

				return v1 - v2;

			};
			res = ci.operation(v1, v2);
			break;

		case 3:
			ci = (Double var1, Double var2) -> {
				return v1 * v2;

			};

			res = ci.operation(v1, v2);
			break;

		case 4:
			ci = (Double var1, Double var2) -> {
				return v1 / v2;

			};

			res = ci.operation(v1, v2);
			break;

		case 5:
			ci = (Double var1, Double var2) -> {
				return v1 % v2;

			};

			res = ci.operation(v1, v2);
			break;

		default:

			System.out.println("Invalid choice...!");
			break;
		}

		if (res != null) {
			System.out.println("The Res of the Operation is: " + res);
		}

	}
}