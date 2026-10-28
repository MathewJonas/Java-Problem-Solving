package ibm.coding;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("mathew");
		String rev ="";
		for(int i=s1.length()-1; i>=0; i--) {
			rev = rev+s1.charAt(i);
		}
		System.out.println(rev);
		if(s1.equals(rev)) {
			System.out.println("The given string is pallindrome");
		}
		else {
			System.out.println("Not a pallindrome");
		}
		
		//reverse string by preserving white spaces
		
		String s2 = "Build your Logics";
		
	}

}
