package com.logic_coding;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number for pallindrome check");
		int ar = sc.nextInt(); //12321
		
		int num=ar;
		int rev =0;
		while(ar!=0) {
			rev = rev * 10 + ar%10;
			ar=ar / 10;
		}
		System.out.println("the reversed number is :" + rev);
		if(num==rev) {
			System.out.println("the given number is palindrome"+num);
		}
		else {
			System.out.println("its not pallindrome");
		}
		

	}

}
