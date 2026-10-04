package com.logic_coding;

import java.util.Arrays;

public class MaxMinElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {2,3,9,19,3,4,5,6,7,8,-10};
		/*
		//using in built method
		Arrays.sort(ar);  //sorted in ascending order
		int min = ar[0];
		int max = ar[ar.length-1];
		System.out.println("the minimum element using in built method is "+min);
		System.out.println("the maximum element using in built method is "+max);
		*/
		//using logic
		int min = Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min) {
				min=ar[i];
				
			}
			if(ar[i]>max){
				max=ar[i];
			}
		}
		System.out.println("the minimum element is "+min);
		System.out.println("the minimum element is "+max);

	}

}
