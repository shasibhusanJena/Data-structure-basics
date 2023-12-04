package abc.ds.top20;

public class Array_MaxMin_Array {
/**
 * Initially, the largest is initialized with Integer.MIN_VALUE and smallest are initialized with Integer.MAX_VALUE.In each iteration of the loop, we compare the current number with the largest and smallest and update them accordingly.
Since if a number is larger than the largest, it can't be smaller than the smallest, which means you don't need to check if the first condition is true, that's why we have used if-else code block, where else part will only execute if the first condition is not true.
Here is another logical diagram or flow chart to find the largest element from an array in Java, here instead of assigning the variable with Integer.MAX_VALUE, we have assigned the first element from the array.
Read more: https://www.java67.com/2014/02/how-to-find-largest-and-smallest-number-array-in-java.html#ixzz7qGqXLdxC
 * @param array
 */
	public static void LargestAndSmallest(int[] array) {
		
		int maximum = Integer.MIN_VALUE;
		int minimum = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] > maximum) {
				maximum =array[i];
			}
			else if(array[i]< minimum) {
				minimum = array[i];
			}
		}
		System.out.println("Max "+maximum+" and Min "+minimum+" value in the Array");
	}
	public static void main(String[] args) {
		
		int[] arr = {1,5,3,6,2,453,34};
		LargestAndSmallest(arr);
		
	}
}
