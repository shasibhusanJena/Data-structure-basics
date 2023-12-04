package abc.ds;

import java.util.Arrays;
/*
 * Sort sub array in an array
 * Print all values in the array using Arrays.toString(arr) method.
 */
public class ArraySort3 {
	public static void main(String[] args) {
	
		int[] arr = {1,4,5,6,3};
		System.out.println("The Original array is");
		for (int num : arr) {
			System.out.print(num+" ");
		}
		Arrays.sort(arr, 2, 5);
		System.out.println("\nAfter array sorting"+Arrays.toString(arr));
	}
}
