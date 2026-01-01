package com.dsa.pairsumzero;

import java.util.ArrayList;
import java.util.Arrays;

public class PairSumZero {

	public static void twoPointerApproach(int arr[], int x) {

		int l = 0, r = arr.length - 1;

		ArrayList<Integer> ouputArray = new ArrayList<>();

		while (l < r) {  //{ -2, -1, 3, 2, 4, 9 }
			int sum = arr[l] + arr[r];

			if (sum == x) {
				ouputArray.add(arr[l]);
				ouputArray.add(arr[r]);
				l++;
				r--;

				while (l < r && arr[l] == arr[l - 1])
					l++;
				while (l < r && arr[r] == arr[r + 1])
					r--;
			}

			else if (sum > x) {
				r--;
			} else {
				l++;
			}

		}
		System.out.println(ouputArray);

	}

	public static void main(String[] args) {

		int arr[] = { -2, -1, 3, 2, 4, 9 };
		int x = 0;
		Arrays.sort(arr);

		twoPointerApproach(arr, x);

	}

}
