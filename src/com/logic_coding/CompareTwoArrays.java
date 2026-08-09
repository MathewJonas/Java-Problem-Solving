package com.logic_coding;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar1[] = {1, 2, 3, 45, 9};
		int ar2[] = {1, 2, 3, 45, 9, 45};
		
		
		// By using equals method
		
		Boolean status = Arrays.equals(ar1, ar2);
		
		if(status==true) {
			System.out.println("Arrays content are equals");
		}
		else {
			System.out.println("Arrays content are equals are not equal");
		}

	}

}
