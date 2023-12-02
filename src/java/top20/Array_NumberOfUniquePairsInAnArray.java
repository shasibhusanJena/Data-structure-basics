package java.top20;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

/*
 Naive Approach
 Here approach will be to create a HashSet which will store unique values of the Point objects
 that from java.awt pkg
*/

public class Array_NumberOfUniquePairsInAnArray {

	/*
	 * below method is for printing the values in the list - pending
	public void  printValue(HashSet<Point> s) {
		Iterable<HashSet<Point>> itr = (Iterable<HashSet<Point>>) s.iterator();
		for (HashSet<Point> hashSet : itr) {
			System.out.println();
		}
	}
*/
	static int count(int[] arr ,int n) {
		
		Set<Point> s = new HashSet<Point>() ;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				s.add(new Point(arr[i],arr[j]));
			}
		}
		System.out.println("values in the set are: "+s);
		
		return s.size();
	}
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3};
		
		System.out.println(count(array,array.length));
		
	}
}
