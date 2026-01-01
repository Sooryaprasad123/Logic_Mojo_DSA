package com.dsa.pairsumzero;

import java.util.HashMap;
import java.util.HashSet;

public class PairSumZeroHashMap {

	public static void hashMapApproach(int arr[]) {

		HashMap<Integer, Integer> map = new HashMap<>();
		HashSet<String> seenPairs = new HashSet<>();
		int target = 0;

		for (int num : arr) {

			int b = target - num;

			if (map.containsKey(b)) {

				int a = Math.min(num, b);
				int c = Math.max(num, b);

				String pairs = a + " " + c;
				if (!seenPairs.contains(pairs)) {
					seenPairs.add(pairs);
				}

			}

			map.put(num, 1);

		}
		System.out.println(seenPairs);

	}

	public static void main(String[] args) {

		int arr[] = { -2, -1, 3, 1, 4, 2 };
		hashMapApproach(arr);

	}

}
