package com.logic_coding;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt(); // 27
		
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Given number is Prime");
			} else {
				System.out.println("not prime number");
			}
		} else {
			System.out.println("not prime");
		}
	}

}
