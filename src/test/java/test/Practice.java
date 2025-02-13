package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Integer[] input  = {1,7,8,5,9,4,4,5,5,66,7,77}; 
			
			Arrays.sort(input, Collections.reverseOrder());
			System.err.println(Arrays.toString(input));
	
		Set<Integer> uniqueVal = new TreeSet <Integer>();
		
		for(int ch:input) {
			uniqueVal.add(ch);
		}
		System.err.println(uniqueVal);
	}

}
