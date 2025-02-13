package practiceJavaBasis;

import java.util.Iterator;

class FindMajorElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,1,4,4,4,4};
		int len = array.length;
		
	for (int i = 0; i < len; i++) {
		 int count=0;
		for (int j = 0; j < len; j++) {
			if(array[i]==array[j]) {
				count++;
			}
			
		}
		if(count>len/2) {
			System.out.println("This is the Majar Number :"+array[i]);
			return;
		}
		}
			System.out.println("No Majore Number Available in Array");
	}
		
	
	
}
