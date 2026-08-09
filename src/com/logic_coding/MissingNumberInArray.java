package com.logic_coding;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Preconditions
		 * 1. Arrays should not have duplicates
		 * 2. Sorted arrays is not mandatory
		 * 3. values should be in range
		 */
		
		int ar[] = {1, 2, 3, 5, 6, 7, 8, 9};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<ar.length;i++) {
			sum1=sum1+ar[i];
		}
		System.out.println("Sum of elements in array is: "+sum1);
		
		for(int i=1; i<10;i++) {
			sum2 = sum2 + i;
		}
		System.out.println("sum of elements in the range is: "+sum2);
		
		int missingNum = sum2-sum1;
		System.out.println("Missing number is: "+missingNum);
	}

}
