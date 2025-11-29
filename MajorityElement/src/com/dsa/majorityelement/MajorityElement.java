package com.dsa.majorityelement;

import java.util.HashMap;
import java.util.Map;

//TC =O(n) SC=O(n)

public class MajorityElement {

	public static void MajorityElementHashing(int arr[]) {

		int n = arr.length;
		Map<Integer, Integer> freqMap = new HashMap<>();

		for (Integer num : arr) {

			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1); 
			if (freqMap.get(num) > n / 2) {

				System.out.println("Majority Element is : " + num);
				return;

			}

		}
		System.out.println("Element not found");

	}

	public static void main(String[] args) {

		int arr[] = { 8, 5, 8, 2, 2, 5, 5, 5 };
		MajorityElementHashing(arr);
	}

}













