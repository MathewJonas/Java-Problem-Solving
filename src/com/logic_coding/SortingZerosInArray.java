
//Move all the zero to the end of the array 
//output = 1,2,5,9,0,0,0,0

package com.logic_coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingZerosInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = { 1, 0, 0, 2, 0, 5, 0, 9 };
		String zero = "";
		List<Integer> lt = new ArrayList<>();

		for (int val : ar) {

			if (val == 0) {
				zero += String.valueOf(val); // to convert int to string
			} else {
				lt.add(val); // [1,2,5,9]
			}
		}

		for (int i = 0; i < zero.length(); i++) {
			lt.add(Integer.parseInt(zero.split("")[i])); // {"0","0","0","0","0"}[i] ==> [1,2,5,9,0,0,0,0]
		}
		System.out.println(lt);
		lt.toArray();

		// same program without using for loop
		
		Integer[] arr = { 29, 12, 2, 0, 0, 5, 0, 49, 0, 2 };
		Arrays.sort(arr); // {0,0,0,0,2,2,5,12,29,49}
		//System.out.println(arr);
		List<Integer> list = Arrays.asList(arr); // [0,0,0,0,2,2,5,12,29,49]
		Collections.reverse(list);
		//System.out.println(list);
		System.out.println(Arrays.toString(list.toArray()));

	}

}
