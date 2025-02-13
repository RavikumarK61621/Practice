package practiceJavaBasis;

import java.util.Iterator;

public class UppercaseCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			String s = "EXecuTe the TEST";
//			int upper = 0;
//			int lower = 0;
//			
//			for(int i=0; i<s.length(); i++) {
//				char ch = s.charAt(i);
//				if(ch>=65 && ch<=90) {
//					upper++;
//				}
//				else
//					lower++;
//			}
//			System.out.println(upper);	
//			System.out.println(lower);
//	}
//
//}

		String s = "EXecuTe the TEST";
		String upper="";
		String lower="";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>=65 && ch<=90) {
				upper=upper+ch;
			}
			else
				lower=lower+ch;
		}
		System.out.println(upper);	
		System.out.println(lower);
}

}
