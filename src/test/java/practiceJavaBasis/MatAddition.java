package practiceJavaBasis;

public class MatAddition {

	public static void main(String[] args) {
		int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] mat2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] output = new int[3][3];

//		System.out.println(mat1[0][0] + mat2[0][0]);

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				output[i][j] = mat1[i][j] + mat2[i][j];
//				System.out.println(mat1[i][j] + mat2[i][j]);

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
