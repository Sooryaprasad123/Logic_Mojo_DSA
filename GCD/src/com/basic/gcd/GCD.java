package com.basic.gcd;

public class GCD {

	public static int euclidAlgo(int a, int b) { 
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;

		}
		return a;

	}

	public static void main(String args[]) {
		int a = 36;
		int b = 60;
		int result = euclidAlgo(a, b);
		System.out.println("Gcd of " + a + "," + b + " is " + result);
	}

}
