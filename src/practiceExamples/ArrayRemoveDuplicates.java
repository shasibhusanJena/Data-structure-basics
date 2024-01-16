package practiceExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ArrayRemoveDuplicates {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(1, 1);
		map.put(2, 1);
		map.put(2, 1);
		map.put(1, 1);
		map.put(1, 1);
		
		for ( Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
