package test;

import java.util.Iterator;

public class Fabbi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 10;
		
		int first = 0;
		int current = 1;
		int end;
		
		for (int i = 1; i <=value-1; i++) {
			end=first+current;
			first=current;
			current=end;
			
			System.out.println(end);
			
		}
		
		
	}

}
