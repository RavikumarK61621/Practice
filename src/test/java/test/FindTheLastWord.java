package test;

public class FindTheLastWord {
	
	public static void main(String[] args) {
	 
		String word = "Given a string s, return true if it is a palindrome, or false otherwise";
		//String word = "Noon";
		
		String LowerCase = word.toLowerCase();
		//System.out.println(LowerCase);
				
		String replaceAll = LowerCase.replaceAll(",","").replaceAll(" ", "");
		//System.out.println(replaceAll);
	
		int length = replaceAll.length()-1;
		System.out.println(length);
		
		boolean flag = false;
		
		for (int i = 0; i < length; i++) {
			if(replaceAll.charAt(i)!=replaceAll.charAt(length-i)) {
				flag = true;
				break;
			}
		}
			if (flag) {
				System.out.println("This Word is not a Palindrome");
			}
				else {
				System.out.println("This Word is a Palindrome");
				}
		}
	}


		


