package abc.ds.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * HashTable is synchronized , and no null key/value allowed.
 */
public class MyHashTableRead {
public static void main(String[] args) {
	
	HashMap<String, Integer> map = new HashMap<>();
	
	map.put("A", 10);
	map.put("B", 20);
	map.put("C", 30);
	map.put("D", 40);
	
	Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
	
	while(itr.hasNext()) {
		Map.Entry<String, Integer> itrEle = (Map.Entry<String, Integer>)itr.next();
		int marks = itrEle.getValue();
		String key = itrEle.getKey();
		
		System.out.println(marks +" "+key);
	}
}
}
