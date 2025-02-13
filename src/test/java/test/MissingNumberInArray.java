package test;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,4,5,6,8,9,10}; 
		
		int n = 10;
		int expectedsum = n*(n+1)/2;
		int actualsum = 0;
		
		for(int in: array) {
			actualsum+=in;
		}
		int output = expectedsum - actualsum;
		System.out.println(output);
	}

}
