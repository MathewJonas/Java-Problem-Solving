package com.logic_coding;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digits = 1234;
		int sum = 0;
		while(digits!=0) {
			sum=sum+digits%10; //4 4+3
			digits=digits/10;  //
		}
		System.out.println("the sum of the digits is "+ sum);
		
		
		//from an Array
		
		int [] ar = {1,2,3,4,5,6};
		int sum1=0;
		
		for(int i=0; i<ar.length; i++) {
			sum1+=ar[i];
		}
		System.out.println(sum1);

	}

}
