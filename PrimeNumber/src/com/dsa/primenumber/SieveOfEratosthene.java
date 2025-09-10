package com.dsa.primenumber;

public class SieveOfEratosthene {

	public static void IsPrime(int n) {

		boolean isPrime[] = new boolean[n + 1];

		for (int i = 2; i <= n; i++) { 
			isPrime[i] = true;
		}

		for (int i = 2; i <=n; i++) {
			if (isPrime[i]) {
				for (int p = i * i; p <=n; p += i) {
					isPrime[p] = false;
				}

			}
		}

		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]) {
		int n = 15;
		IsPrime(n);
	}

}
