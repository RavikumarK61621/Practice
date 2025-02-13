package practiceJavaBasis;

public class MatMultiple {
	
	public static void main(String[] args) {
		int[] ages = {20,22,18,35,48,26,87,70};
		
		int agel = ages.length;
		int lowage = ages[0];
			
		for (int i : ages) {
			if(lowage > i) {
				lowage=i;			
		}
		}
	System.out.println(lowage);	
	}

	
		
//		int[] age = {20,22,18,35,48,26,87,70};
//		
//		int total = 0;
//		
//		for (int i = 0; i < age.length; i++) {
//			total = total+age[i];
//			
//		}
//		float aveageage = total/age.length;
//		System.out.println(aveageage);
//	}

	
	
}
