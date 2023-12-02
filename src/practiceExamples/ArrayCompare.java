package practiceExamples;

import java.util.Arrays;

public class ArrayCompare {
public static void main(String[] args) {
	
	int[] arr1 = new int[] {1,2,3,4};
	int[] arr2 = new int[] {1,2,3,4};
	int[] arr3 = new int[] {1,2,4,4};
	
	System.out.println("Array compare :-"+Arrays.equals(arr1, arr2));
	System.out.println("Array compare : "+Arrays.equals(arr1, arr3));
	
}
}
