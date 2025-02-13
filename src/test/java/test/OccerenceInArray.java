package test;

public class OccerenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "your code goes here";
		
		String[] sw = word.split(" ");
		
	    for(int i=0; i<=sw.length-1;i++ ){
	        char firstcharacter = sw[i].charAt(0);
	        String valueOf = String.valueOf(firstcharacter).toUpperCase();
	        String sub = sw[i].substring(1);
	        System.out.println(valueOf+sub);

	}

	}}
