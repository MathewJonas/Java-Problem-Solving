package ibm.coding;

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
		char[] ar1 = str.toLowerCase().toCharArray();
		String reverse = " ";
		for (int i = ar.length - 1; i >= 0; i--) {
			reverse = rev + ar[i];

		}
		System.out.println("reversed sentence is: " + rev);

		// reverse a string by preserving the spaces and words order but reversing the words

		String str2 = "Automation is important";
		String[] words = str2.split(" ");
		String reversedSentence = "";
		

	

	}

}
