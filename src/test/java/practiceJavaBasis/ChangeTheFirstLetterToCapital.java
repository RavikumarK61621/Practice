package practiceJavaBasis;

public class ChangeTheFirstLetterToCapital {

	public static void main(String[] args) {

		String texts = "execute the text";
		
		String[] words = texts.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(String word: words) {
			if(!word.isEmpty()) {
				
			     result.append(Character.toUpperCase(word.charAt(0)))
			     .append(word.substring(1))
			     .append(" ");
				
//				result.append(word.substring(0,word.length()-1))
//				 .append(Character.toUpperCase(word.charAt(word.length()-1)))
//					.append(" ");
				}
			}
			String Text = result.toString().trim();
			System.out.println(Text);
	}
}
