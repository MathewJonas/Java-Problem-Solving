package com.logic_coding;

import java.util.Scanner;

public class SumofNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("enter the number");
		int num = sc.nextInt();          //1234
		int sum=0;
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("the sum of number of digits is "+sum);
		

	}

}
