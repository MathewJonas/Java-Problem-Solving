package ibm.coding;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a string without using a built-in reverse/slice trick
		String str = "Automation";
		char[] ar = str.toLowerCase().toCharArray();
		String rev = " ";
		for(int i= str.length()-1; i>0; i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
