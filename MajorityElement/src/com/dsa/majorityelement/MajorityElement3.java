package com.dsa.majorityelement;

public class MajorityElement3 {

	// TC =O(n) , SC =O(1)

	public static void majorityElementByNby3(int arr[]) {

		int count1 = 0, count2 = 0;

		int candidate1 = -1, candidate2 = -1;

		for (int num : arr) {
			if (num == candidate1) {

				count1++;
			} else if (num == candidate2) {

				count2++;
			}

			else if (count1 == 0) {

				candidate1 = num;
				count1++;

			}

			else if (count2 == 0) {
				candidate2 = num;
				count2++;
			}

			else {
				count1--;
				count2--;
			}

		}

		count1 = 0;
		count2 = 0;
		for (int num : arr) {
			if (num == candidate1) {
				count1++;
			} else if (num == candidate2) {
				count2++;
			}
		}

		if (count1 > arr.length / 3) {
			System.out.println("First Majority element is : " + candidate1);
		}

		if (count2 > arr.length / 3) {
			System.out.println("Second Majority element is : " + candidate2);
		}

	}

	public static void main(String[] args) {

		int arr[] = { 8, 5, 8, 8, 8, 5, 5, 5, 1 };
		majorityElementByNby3(arr);

	}

}
