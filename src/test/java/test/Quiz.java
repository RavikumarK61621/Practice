package test;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {


		int n=3;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}	
		
//		int s[] = { 1, 2, 3, 4, 5, 5, 6, 6, 7, 8, 8 };
//
//		for (int i = 0; i < s.length; i++) {
//			boolean flag = true;
//			for (int j = 0; j < s.length; j++) {
//				if (i == j) {
//					continue;
//				}
//				if (s[i] == s[j]) {
//					flag = false;
//					break;
//				}
//			}
//			if (flag) {
//				System.out.println("Unique values:" + s[i]);
//			}
//		}
	}
}

//	int x= 9, y=5;
//	int temp;
//	
//	temp = x;
//	x=y;
//	y=temp;
//	
//	System.out.println("x value = "+ x);
//	System.out.println("y value = "+ y);		
