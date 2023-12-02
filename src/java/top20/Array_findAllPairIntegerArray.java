package java.top20;

import java.util.Arrays;

/*
 * How do you find all pairs of an integer array whose sum is equal to a given number? 
 * below is called two pointer prob with  O(N) with additional space and O(NLogN) in place
 */
public class Array_findAllPairIntegerArray {

    public static void main(String args[]) {
    	printPairsUsingTwoPointers( new int[]{ 1,4,5,7,2,6,4,9}, 11);
        
     }

	/**
      * Given a number finds two numbers from an array so that
      * the sum is equal to that number k.
      * @param numbers
      * @param k
      */
     public static void printPairsUsingTwoPointers(int[] array, int target){
    	 Arrays.sort(array);
         if(array.length < 2){
             return;
         }
         int left =0;
         int right = array.length-1;
         
         while (left <right) {
        //	System.out.println(left +"  "+right); 
			int sum = array[left] +array[right];
			if(sum == target) {
				System.out.printf("(%d, %d) %n", array[left],array[right]);
				left = left +1;
				right = right -1;
			}
			else if(sum <target) {
				left = left +1;
				
			}
			else if(sum > target)
			{
				right = right -1;
			}
		}
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
     }
}
