package abc.ds.top20;

import java.util.Scanner;
/**
 * Although the entire array is not sorted from left to right, the subarray on the left of the pivot and on the right of the pivot will still be sorted. 
 * We can use this fact and apply binary search to find the element in the array in O(log(n)) time complexity. 
 * Following is the solution to the problem with comments for clarity:
 * @author shjena
 * https://www.callicoder.com/rotated-sorted-array-search/
 */
public class Array_RotatedSortedArraySearch {

	private static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = (start + end)/2;

            if(target == nums[mid]) {
                return mid;
            }

            if(nums[start] <= nums[mid]) { // left array is sorted
                if(target >= nums[start] && target < nums[mid]) { // target lies between start and mid index
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else { // right array is sorted
                if(target > nums[mid] && target <= nums[end]) { // target lies between mid and end index
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of element in Array");
        int n = keyboard.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
          nums[i] = keyboard.nextInt(); 
        }
        System.out.println("check index location of :");
        int target = keyboard.nextInt();
        keyboard.close();

        System.out.printf("Search(%d) = %d%n", target, search(nums, target));
    }
}
