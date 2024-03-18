package practiceExamples;

import java.util.Iterator;

/**
 * remove duplicates from sorted array
 * @author shjena
 * removing duplicates from a sorted array, but with a constraint that allows at most two occurrences of each element. The use of a two-pointer approach is hinted by the iteration variable j in the code.
 */
public class removeDuplicates1 {

	public int removeDuplicates(int[] nums) {
		int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (j == 1 || nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
                System.out.println(nums[i]);
            }
            
        }
        return j;
   
    }
public static void main(String[] args) {
	
	int[] arr = {0,0,1,1,1,1,2,3,3} ;
	int x = new removeDuplicates1().removeDuplicates(arr);
	
}
}
