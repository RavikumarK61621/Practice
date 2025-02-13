package test;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Occerance";
		
		Map<Character, Integer> mapval = new HashMap<Character, Integer>();
		
		char[] charArray = word.toCharArray();
		
		for(char ch:charArray) {
			if(!mapval.containsKey(ch)) {
				mapval.put(ch, 1);
			}
			else {
				Integer value = mapval.get(ch);
				mapval.put(ch, value+1);
			}
		}
		System.out.println(mapval);
	}

}
