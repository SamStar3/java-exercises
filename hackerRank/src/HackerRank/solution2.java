package HackerRank;

import java.util.Scanner;

public class solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		String s = String.format("%.2f", payment);
		double us = payment;
		double india = payment;
		double china = payment;
		double france = payment;
		char rupeesSymbol = '\u20B9';
		char dollarSymbol = '\u0024';
		char euroSymbol = '\u20AC';
		char yuanSymbol = '\u00A5';

		// Write your code here.
		System.out.println("US: " + dollarSymbol + String.format("%.2f", us));
		System.out.println("India: " + rupeesSymbol + String.format("%.2f", india));
		System.out.println("China: " + yuanSymbol + String.format("%.2f", china));
		System.out.println("France: " + String.format("%.2f", france) + " " + euroSymbol);

	}

}
