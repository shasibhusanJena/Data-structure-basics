package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 *
 You are given an integer array nums of size n and a positive integer k.

Divide the array into one or more arrays of size 3 satisfying the following conditions:
Each element of nums should be in exactly one array.
The difference between any two elements in one array is less than or equal to k.
Return a 2D array containing all the arrays. If it is impossible to satisfy the conditions, return an empty array. And if there are multiple answers, return any of them.
 
 * Divide array into arrays with max Difference
 * Example 1:
		Input: nums = [1,3,4,8,7,9,3,5,1], k = 2
		Output: [[1,1,3],[3,4,5],[7,8,9]]
		Explanation: We can divide the array into the following arrays: [1,1,3], [3,4,5] and [7,8,9].
		The difference between any two elements in each array is less than or equal to 2.
		Note that the order of elements is not important.
	Example 2:
	
	Input: nums = [1,3,3,2,7,3], k = 3
	Output: []
	Explanation: It is not possible to divide the array satisfying all the conditions.
 */
public class DivideArrayintoArrays {
	
	public int[][] divideArray(int[] nums,int k){
		
		Arrays.sort(nums);
		List<int[]> res = new ArrayList<>();
		for(int i=2; i<nums.length;i =i+3) {
		//	System.out.println(nums[i-2]+" "+nums[i-1]+" "+nums[i]);
			if(nums[i]-nums[i-2]>k) {
				return new int[][] {};
			}
			
			res.add(new int[] {nums[i-2],nums[i-1],nums[i]});
		}
		return res.toArray(new int[res.size()][]);
	}
	
public static void main(String[] args) {
	int[] arr = {1,3,4,8,7,9,3,5,1};
	int[][] res  = new DivideArrayintoArrays().divideArray(arr,2);
	for(int i =0 ; i < res.length;i++) {
		for (int j = 0; j < res[i].length; j++) {
			System.out.print(res[i][j]+" ");
		}
		System.out.println();
		
	}
}
}
