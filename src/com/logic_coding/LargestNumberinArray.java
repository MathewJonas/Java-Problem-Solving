package com.logic_coding;

public class LargestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = { 110, 50, 30, 80, 5, 100 };
		int largest = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > largest) {
				largest = ar[i];
			}
		}
		System.out.println("Largest number in the given array is " + largest);

	}

}
