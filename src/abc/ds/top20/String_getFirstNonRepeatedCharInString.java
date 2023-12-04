package abc.ds.top20;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * Java Program to find the first Unique Character in a given String

Read more: https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#ixzz7qHLVTA45
 * @author shjena
 * to solve this problem we are using linkedHashMap as it keeps order of the data insertion 
 */
public class String_getFirstNonRepeatedCharInString {

	public static void main(String[] args) {
		
		String str = "abampqrscbm";
		getFirstNonRepeatedChar(str);
	}
	
	public static void getFirstNonRepeatedChar(String str)throws RuntimeException {
		// create a linedHashMap to store the key values
		HashMap<Character, Integer> counts = new LinkedHashMap<>();
		
		// now convert array into a charArray and run over it;
		char[] charArr = str.toCharArray();
		for(char key:charArr) {
			counts.put(key, counts.containsKey(key)? counts.get(key)+1:1 );
		}
		for (Entry<Character, Integer> entry:counts.entrySet()) {
			if (entry.getValue() ==1) {
				
				System.out.println("The First unique char is "+entry.getKey());
				break;
			}
		}
		
	}
}
