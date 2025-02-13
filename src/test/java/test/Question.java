package test;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       String input = "QWErty123@@%";

	        // Remove non-alphabet characters and reverse the remaining letters
	        String output = new StringBuilder(input.replaceAll("[^a-zA-Z]", "")).reverse().toString();

	        System.out.println(output); // Expected Output: YTRewq
	    
		 
		 
	}

}
