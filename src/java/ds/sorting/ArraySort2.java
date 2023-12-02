package java.ds.sorting;

import java.util.Arrays;
/*
 * Print all values in the array using Arrays.toString(arr) method.
 */
public class ArraySort2 {
	public static void main(String[] args) {
	
		int[] arr = {1,4,5,6,3};
		System.out.println("The Original array is");
		for (int num : arr) {
			System.out.print(num+" ");
		}
		Arrays.sort(arr);
		System.out.println("\nAfter array sorting"+Arrays.toString(arr));
	}
}
