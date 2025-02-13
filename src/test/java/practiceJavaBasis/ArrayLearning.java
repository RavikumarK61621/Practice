package practiceJavaBasis;

public class ArrayLearning {

	public static void main(String[] args) {
		int mat1[][]  = {{12,13}, {9,8,7,15}, {6,5,4,17,18}};

		
//		System.out.println(mat1[0][0]);
//		System.out.println(mat1[0][1]);
//		System.out.println(mat1[0][2]);
//		System.out.println(mat1[1][0]);
//		System.out.println(mat1[1][1]);
//		System.out.println(mat1[1][2]);
//		System.out.println(mat1[2][0]);
//		System.out.println(mat1[2][1]);
//		System.out.println(mat1[2][2]);
		
		for(int i=0;i<=mat1.length-1;i++) {
			for(int j=0; j<=mat1[i].length-1; j++) {
				System.out.println(mat1[i][j]);
			}
		}
	}

}
