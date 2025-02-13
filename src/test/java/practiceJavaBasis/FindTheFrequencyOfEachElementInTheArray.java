package practiceJavaBasis;

import java.util.Arrays;

public class FindTheFrequencyOfEachElementInTheArray {

	public static void main(String[] args) {
		
		int[] arr = {10,5,10,15,10,5,1,2,3,4,4,4,5,6,6,5,7,5,9,2};

		int[] visit = new int [arr.length];
		Arrays.fill(visit, 0);
		
		for(int i=0; i<=arr.length-1; i++) {
			if(visit[i]==1) {
				continue;
			}
			
			int count = 1;
		for (int j = i+1; j <= arr.length-1; j++) {
			if(arr[i]==arr[j]) {
				count++;
				visit[j]=1;
			}
		}
		System.out.println(arr[i] +":"+ count);
		}
		
//		for (int i : arr) {
//			int count = 0;
//			for (int j : arr) {
//				if (i==j) {
//					count++;
//				}
//			}
//			
//			System.out.printf("The count of %d : %d", i, count);
//			System.out.println();
//			
//		}
	
		
	}

}