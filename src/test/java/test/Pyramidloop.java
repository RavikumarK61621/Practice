package test;

import java.util.Scanner;

public class Pyramidloop {

	public boolean Findprime(int uInput) {
		boolean fPrime = true;

		if (uInput == 0 || uInput == 1) {
			return true;
		}
		for (int i = 2; i <= uInput / 2; i++) {
			if (uInput % i == 0) {
				fPrime = false;
				break;
			}
		}

		return fPrime;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user input");
		int ui = scanner.nextInt();

		Pyramidloop PL = new Pyramidloop();

		boolean inputpass = PL.Findprime(ui);

		String PrN = inputpass ? "prime" : "Not a prime";

		System.out.println("This is: " + PrN);

//	Output
//	***
//	***
//	***
//
//		int n = 3;
//
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//
//				System.out.print("*");
//			}
//				System.out.println();	
//		}

//		Output
//		*
//		**
//		***
//		
//		int n=3;
//				
//			for(int i=1; i<=n; i++) {
//				for(int j=0; j<i; j++) {
//					System.out.print("*");
//			}
//					System.out.println();
//		}

//		Output
//		***
//		**
//		*
//		
//		int n=3;
//		for(int i=1; i<=n; i++) {
//			for(int j=n; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the User Input");
//		String userInput = scanner.nextLine();
//		boolean flag = false;
//		int length = userInput.length() - 1;
//		System.out.println(length);
//
//		for (int i = 0; i < length; i++) {
//				if (userInput.charAt(i) != userInput.charAt(length-i)) {
//				flag = true;
//				break;
//			}
//
//		}
//		if (flag) {
//			System.out.println("NP");
//		} else {
//			System.out.println("P");
//		}

	}

}