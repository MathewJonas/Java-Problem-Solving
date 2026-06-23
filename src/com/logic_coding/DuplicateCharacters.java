package com.logic_coding;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		
		//Method 1 - using HashMap 
		String str = "Mathew Jonass".toLowerCase();
		char arr[]=str.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap();
		for(char ch : arr) {
			if(ch==' ') {
				continue;
			}
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			} else
			{
				map.put(ch, 1);
			}
		}
		System.out.println("the duplicate characters are " + map);
		
		
		/*
		//using nested for loop
		
		String str = "Mathews jonas";
		str=str.toLowerCase();
		char ar[] = str.toCharArray();
		int count = 0;
		for(int i =0; i<ar.length;i++) {
			for(int j=i+1; j<ar.length;j++)
			{
				if( ar[i] == ar[j]){
				System.out.println("the duplicate characters are "+ ar[i] );
				count++;
			}
			
		}

	}
		System.out.println("duplicate character count is :"+ count);
	}
}

		*/
	}
}



