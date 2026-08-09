package com.logic_coding;

public class CountNumberofStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("Prepare well for the Interview");
		int count=0;
		String rev ="";
		for(int i=str.length()-1;i>0;i--) {
			 rev = rev+str.charAt(i);
		}
		System.out.println("Reversed String is "+rev);

	}

}
