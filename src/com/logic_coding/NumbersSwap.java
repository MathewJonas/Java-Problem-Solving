package com.logic_coding;

public class NumbersSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swapping with 3rd variable
		int a = 25;
		int b = 7;
		System.out.println("Before swapping the values are" +" "+ a + " "+b);
		
		/*
		int temp = a;
		a = b;
		b=temp;
		System.out.println("After swapping is .." +a+ " "+ b);  
		*/
		
		//without third variable (+ and - operators) without third variable
		
		/*
		 a = a + b;
		 b = a - b;
		 a = a - b;
		 System.out.println("After swapping is .." +a+ " "+ b);  
		 */
		
		//without third variable (* and / operators) without third variable
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After swapping is .." +a+ " "+ b);
			
	
	}

}
