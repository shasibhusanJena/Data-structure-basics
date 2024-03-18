package practiceExamples;

import java.util.Iterator;

public class Example {
	public int removeDuplicates(int[] nums) {
		int j =1;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[i-1]) {
				nums[j++] =nums[i]; 
				System.out.println(nums[i]);
			}
		}
		return j;
	}
	public static void main(String[] args) {
	
	int[] arr = {0,0,1,1,1,2,2,3,3,4};	
	Example e1 = new Example();
	System.err.println(e1.removeDuplicates(arr));
}
}
