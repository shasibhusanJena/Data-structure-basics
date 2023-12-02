package java.top20;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

/*
 Naive Approach
 Here approach will be to create a HashSet which will store unique values of the Point objects
 that from java.awt pkg
*/

public class Array_NumberOfUniquePairsInAnArray1 {

	static int count(int[] arr ,int n) {
		
		HashSet<Integer> s = new HashSet<Integer>() ;
		for (int i = 0; i < n; i++) {
			s.add(arr[i]);
		}
		int count = (int) Math.pow(s.size(), 2);
		
		return count;
	}
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4};
		
		System.out.println(count(array,array.length));
		
	}
}
