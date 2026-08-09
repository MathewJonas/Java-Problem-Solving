package com.logic_coding;

public class ReverseStringByWords {

	public static void main(String[] args) {
		// Reverse Each Word by preserving the spaces

		String str = "Mathew is working at Simplilearn";
		String[] words = str.split(" ");
		String result = "";
		for (String word : words) {

			String revWord = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				revWord += word.charAt(i);

			}

			result = result + revWord + " ";

		}

		System.out.println(result);
	}

}
