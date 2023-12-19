package abc.ds.top20;

import java.util.Scanner;
/**
 * Although the entire array is not sorted from left to right, the subarray on the left and on the right of the pivot will still be sorted. 
 * We can use this fact and apply binary search to find the element in the array in O(log(n)) time complexity. 
 * Following is the solution to the problem with comments for clarity:
 * @author shjena
 * https://www.callicoder.com/rotated-sorted-array-search/
 */
public class Array_RotatedSortedArraySearch {

	private static int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while(startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex)/2;

            if(target == nums[midIndex]) {
                return midIndex;
            }

            if(nums[startIndex] <= nums[midIndex]) { // left array is sorted
                if(target >= nums[startIndex] && target < nums[midIndex]) { // target lies between start and mid index
                    endIndex = midIndex-1;
                } else {
                    startIndex = midIndex+1;
                }
            } else { // right array is sorted
                if(target > nums[midIndex] && target <= nums[endIndex]) { // target lies between mid and end index
                    startIndex = midIndex+1;
                } else {
                    endIndex = midIndex-1;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {

    	int[] arr = new int[] {1,4,5,6,7,8,9,11};
    	int target = 9;
        System.out.printf("Index of target int %d  is %d ", target, search(arr, target));
    }
}
