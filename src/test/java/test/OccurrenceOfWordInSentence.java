package test;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Occerance in this word need to find is word of correct";
		
		String[] split = word.split(" ");
	
		Map<String, Integer> mpval = new HashMap<>();
		
		for(String ch:split){
		    if(!mpval.containsKey(ch)){
		        mpval.put(ch, 1);
		        
		    }
		    else{
		        Integer value = mpval.get(ch);
		        mpval.put(ch, value+1);
		    }
		 }
		System.out.println(mpval);
	}

}
