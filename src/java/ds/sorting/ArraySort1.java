package java.ds.sorting;

import java.util.Arrays;
/*
 * Here we are sorting elements using Array.sort() method
 */
public class ArraySort1 {
	public static void main(String[] args) {
	
		int[] arr = {1,4,5,6,3};
		System.out.println("The Original array is");
		for (int num : arr) {
			System.out.print(num+" ");
		}
		Arrays.sort(arr);
		System.out.println("\nAfter array sorting");
		for (int num : arr) {
			System.out.print(num+" ");
		}
	}
}
