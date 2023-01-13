package practiceExamples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatesInarray {

	public static void removeDuplicate(int[] arr) {
		int arrlen =arr.length;
		if(arrlen ==0 || arrlen ==1) {
			System.out.println("array length is "+arrlen);	
		}
		int j=0;
		for (int i = 0; i < arrlen-1; i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++]= arr[arrlen-1];
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	//using HashMap  Time complexity O(n) Space Complexity O(n)
	public  static void  removeDuplicateinArrayUsingHashMap(int[] arr) {
		HashMap<Integer, Boolean>  hashMap = new HashMap<Integer,Boolean>();
		for (int i = 0; i < arr.length; i++) {
			hashMap.put(arr[i], true);
		}
		hashMap.forEach((key,value)->{
			
			System.out.print(key+" ");
		// System.out.println(v);
			
		});
	}
	//using map
	public  static void  removeDuplicateinArrayUsingSet(int[] arr) {
		
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println("\nSet elements are "+set);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,2,2,2,3,4,5};
		
	//	RemoveDuplicatesInarray.removeDuplicateinArrayUsingHashMap(arr);
	//	RemoveDuplicatesInarray.removeDuplicateinArrayUsingSet(arr);
		RemoveDuplicatesInarray.removeDuplicate(arr);
	}
}
