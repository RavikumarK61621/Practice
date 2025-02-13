package test;

public class RevereseTheSentence {

	public static void main(String[] args) {
		
		String ss = "You can give the Multiple catch";
		
		String[] word = ss.split(" ");
		
		String reverse = "";
		
		for(int i=word.length-1; i>=0; i--) {
			reverse=reverse+word[i]+ " ";
		}
			System.out.println(reverse);
	}

}
