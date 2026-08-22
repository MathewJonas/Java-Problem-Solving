package com.logic_coding;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MathewJonas";
		String st=str.toLowerCase();
		char ar[] = st.toCharArray();
		int count =0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1; j<ar.length;j++) {
				if(ar[i] == ar[j]) {
			System.out.println("Duplicate element is: "+ar[i]);
					count++;
			}
				
		}
		System.out.println(count);

	}

}
}
