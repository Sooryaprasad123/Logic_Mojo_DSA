package com.dsa.majorityelement;


//TC = O(n) SC = O(1)
public class MoreVotingAlgo {

	public static void moreVotingAlgo(int arr[]) {

		int n = arr.length;
		int count = 0;
		int candidate = -1;

		for (int num : arr) {
			if (count == 0) {
				candidate = num;
				count++;
			} else if (candidate == num) {
				count++;
			} else {
				count--;
			}

		}

		count = 0;
		for (int num1 : arr) {
			if (candidate == num1) {
				count++;
			}
		}

		if (count > n / 2) {
			System.out.println("Majority Element found " + candidate);
		}

		else {
			System.out.println("Majority element not found");

		}
	}

	public static void main(String[] args) {

		int arr[] = { 8, 5, 8, 2, 5, 5, 5, 5 };
		moreVotingAlgo(arr);
	}

}
