package leetcode;

import java.util.Arrays;
/**
 * 
 * @author shjena
 * remove duplicate values from the array
 */
public class RemoveDuplicatesFromArray {

	public void printValue(int arr[]) {
		// Print all value in the array
		System.out.println("inserted values are :-");
		for(int i =0 ;i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	public int[] sortElementsInArray(int arr[]) {
		
		Arrays.sort(arr);
		System.out.println("\n--- Values after sorting----");
		return arr;
	}
	
	public int removeDuplicate(int arr[],int len) {
		
		printValue(arr);
		
		// Sort all array elements in the array
		int[] sortedArray =sortElementsInArray(arr);
		printValue(sortedArray);
		
		int[] temp = new int[len];
		int j =0;
		// delete all duplicate elements
		for (int i = 0; i < sortedArray.length-1; i++) {
			if(sortedArray[i]!=sortedArray[i+1]) {
				temp[j++] = sortedArray[i];
			}
		}
		// to get last element of the real array into the temp array
		temp[j++] = arr[len-1];
		// to get all temp array with unique data back to real array
		for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }		
		return j;
	}
	
	public static void main(String[] args) {
	
		int[] arr = {1,4,5,3,2,4,2,4,2,7,6,8};
		RemoveDuplicatesFromArray rmd = new RemoveDuplicatesFromArray();
		int result = rmd.removeDuplicate(arr,arr.length);
		System.out.println("\n Distinct values are ");
		for (int i = 0; i < result; i++) {
			
			System.out.print(arr[i]);
		}
	}

	
}
