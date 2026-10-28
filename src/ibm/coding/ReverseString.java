package ibm.coding;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a string without using a built-in reverse/slice trick
		String str = "Automation";
		char[] ar = str.toLowerCase().toCharArray();
		String rev = " ";
		for (int i = ar.length - 1; i > 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		// reverse a string by preserving the spaces
		String str1 = "Automation is fun";
		char[] ar1 = str1.toLowerCase().toCharArray();
		String reverse = "";
		for (int i = ar.length - 1; i >= 0; i--) {
			reverse = reverse + ar[i];

		}
		System.out.println("reversed sentence is: " + reverse);

		// reverse a string by preserving the spaces and words order but reversing the
		// words

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str3 = sc.nextLine();

		String[] words = str3.split(" ", -1);
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			StringBuilder word = new StringBuilder(words[i]);
			result.append(word.reverse());

			if (i < words.length - 1) {
				result.append(" ");
			}
		}

		System.out.println("Reversed words: " + result);

		sc.close();
		
		
		//Another approach without using built-in methods i.e using nested loop
		String st = "Mathew is an SDET";
		String[] wd = st.split(" ", -1); //split(" ", -1) separates the string into words
		
		for (int i = 0; i < wd.length; i++) { //The outer loop processes each word from left to right, preserving the word order

            for (int j = wd[i].length() - 1; j >= 0; j--) { //inner loop starts at the last character of each word and moves backward to index 0
                System.out.print(wd[i].charAt(j));
            }

            if (i < wd.length - 1) {           //if condition prints a space between words
                System.out.print(" ");
            }
        }

        sc.close();
	}

}
