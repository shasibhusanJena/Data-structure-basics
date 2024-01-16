package abc.ds.collection;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Linked list is a combination of HashTable and Linked list implementations of the MAp interface
 * @author shjena
 *
 */
public class LinedHashMapAllOperation {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> str = new LinkedHashMap<>();
		
		str.put("one", "This is the First element");
		str.put("two", "This is the second element");
		str.put("three", "This is the third element");
		str.put("four", "This is the fourth element");
		
		System.out.println(str);
		
		System.out.println("Get value for key Two "+ str.get("two"));
		System.out.println("Size of the map "+str.size());
		System.out.println("Is map enpty ?"+str.isEmpty());
		System.out.println("Delete first element "+str.remove("one"));
		System.out.println(str);
		
		System.out.println("Iterate through linkedHashMap");
		
		Set<String> str1 = str.keySet();
		for(String k :str1) {
			System.out.println(k+" :: And value ::"+str.get(k));
		}
		
		System.out.println("check if the value exist in the LinkedHashMap ");
		System.out.println("Map contains Value "+str.containsValue("This is the third element"));
		
		System.out.println("Remove all elemnts from LinkedHashMap ");
		str.clear();
		
		System.out.println("After removal all records from LinkedHashMap : "+str);
		
		
	}
}
