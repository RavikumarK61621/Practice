package practiceJavaBasis;

import java.util.Arrays;

public class FrequencyOfEachElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int[] array = {1, 2, 2, 3, 4, 4, 4, 5};
	      
	      int[] visit = new int[array.length];
	      Arrays.fill(visit, 0);
	      
	      for (int i = 0; i < array.length; i++) {
			if(visit[i]==1) {
				continue;
			}
			
			int count = 1;
			for (int j = i+1; j < array.length; j++) {
				if(array[i]==array[j]) {
					count++;
					visit[j] = 1;
				}
				
			}
			System.out.println(array[i] +":"+ count);
			
		}
	      
	}

}
