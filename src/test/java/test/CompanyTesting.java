package test;

public class CompanyTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ravi kumar";
		
		String[] sName = name.split(" ");
//		System.out.println(sName[1]);
		
		char[] charArray = sName[0].toCharArray();
//		System.out.println(charArray);
		
		String rev = "";
		
		for(int i=charArray.length-1; i>=0;i--) {
			rev=rev+charArray[i];
		
		}
		System.out.println("reversed the first name: " + rev +" "+ sName[1]);
	}

}
