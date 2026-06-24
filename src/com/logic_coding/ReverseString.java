package com.logic_coding;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reverse Entire String (Without Built-in Function)
		String str = new String("Mathew is a Automation Tester");
		String rev = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Guven String is " + str);
		System.out.println("Reversed String is" + rev);

		// Reverse Entire String (using Built-in Function)

		String rev1 = new StringBuilder(str).reverse().toString();
		System.out.println(rev1);
		
		
	}

}
