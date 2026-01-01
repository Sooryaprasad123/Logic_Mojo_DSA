package com.dsa.pairsumzero;

import java.util.HashSet;

public class PairSumZeroHashing {

	public static void hashSetApproach(int[] arr) {

		HashSet<Integer> set = new HashSet<>(); // -2, -1, 3, 1, 4, 2

		HashSet<String> seenPair = new HashSet<>();

		for (int num : arr) {

			if (set.contains(-num)) {
				int a = Math.min(num, -num);
				int b = Math.max(num, -num);
				String Pairs = a + " , " + b;

				if (!seenPair.contains(Pairs)) {

					seenPair.add(Pairs);

					System.out.println(Pairs);

				}

			}
			set.add(num);

		}

	}

	public static void main(String[] args) {

		int arr[] = { -2, -1, 3, 1, 4, 2 };
		hashSetApproach(arr);

	}

}
