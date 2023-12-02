package others.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author shjena
 * We need first Non repetitive char from the String value as input
 * Not working solution
 */
public class FindFirstNonRepetedCharInString {

	public char intFirstNonRepetedChar(String str){
		
		HashMap<Character,Integer> temp = new HashMap();

		for (int i = 0; i < str.length(); i++) {
			if (temp.containsKey(str.charAt(i))) {
				Integer value = temp.get(str.charAt(i));
				value = value+1;
				System.out.println("if block value is "+value+" for char:-  "+str.charAt(i));
				temp.put(str.charAt(i), value);
			}
			else {
				System.out.println("from else block");
				temp.put(str.charAt(i), 1);
			}
		}
		Iterator iterate = temp.entrySet().iterator();
		while (iterate.hasNext()) {
			Map.Entry mapElement= (Entry) iterate.next();
			System.out.println("Key is "+mapElement.getKey()+" value is"+mapElement.getValue());
			
			
		}
		
		return 0;
		
	}
	public static void main(String[] args) {
	String str = "abaabcdres";
	FindFirstNonRepetedCharInString s1 = new FindFirstNonRepetedCharInString();
	char ch = s1.intFirstNonRepetedChar(str);
	System.out.println("First Non Repeted Char is"+ch);
	}
}
