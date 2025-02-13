package practiceJavaBasis;

import java.util.Iterator;

public class ArrySub {

	public static void main(String[] args) {

		int[][] mat11 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] mat12 = { { 11, 21, 31 }, { 41, 51, 61 }, { 71, 81, 91 } };

		int[][] output = new int[3][3];
		
		for (int i = 0; i < mat11.length; i++) {
			for (int j = 0; j < mat11[1].length; j++) {
				output[i][j] = mat11[i][j] - mat12[i][j];
//				System.out.println(mat11[i][j] + mat12[i][j]);
			}
		}
		
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + "\t");
								
			}
			System.out.println();
		}
		
	}

}
