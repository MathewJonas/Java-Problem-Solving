package com.logic_coding;

import java.util.Scanner;

public class LargestofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the first number");
		int a = sc.nextInt();  
		
		System.out.println("enter the second number");
		int b = sc.nextInt();  
		
		System.out.println("enter the third number");
		int c = sc.nextInt();  

		if (a > b && a > c) {
			System.out.println(a + " is largest");
		} else if (b > a && b > c) {
			System.out.println(b + " is largest");

		} else {
			System.out.println(c + " is largest");
		}
		
		// 2nd WAY:  using ternary operator (The Java ternary operator (? :) is a shorthand alternative to writing traditional if-else statements. It is called a "ternary" operator
		//because it works with three operands: a boolean condition, a value to return if true, and a value to return if false)
		
		int largest = a>b?a:b;
		largest = c>largest?c:largest;
		
		System.out.println("the largest value is "+largest);
				
		
	}

}
