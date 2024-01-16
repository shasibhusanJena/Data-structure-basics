package abc.ds.top20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author shjena
 * remove duplicate values from the array 
 * this method is called using " HashMap"
 */
public class Array_RemoveDuplicatesWithCollection {

	
	public static void removeDuplicate(int arr[],int len) {
		
		Map<Integer, Boolean> map = new HashMap<>();
		for(int i =0;i< arr.length;i++) {
			if(map.get(arr[i])  == null) {
				System.out.println(arr[i]);
				map.put(arr[i], true);
			}
		}
	}
	
	public static void main(String[] args) {
	
		int[] arr = {1,4,5,3,2,4,2,4,2,7,6,8};
		removeDuplicate(arr,arr.length);
	}
}
