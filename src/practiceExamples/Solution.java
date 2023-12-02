package practiceExamples;

/*
Time Complexity: O((N-1)C(K-1))
Space Complexity: O(N),

where 'N' is the number of elements in the array and K is the number of sub-arrays such that the maximum sum achieved from the 'K' subarrays formed must be the minimum possible.
*/

import java.util.ArrayList;
/*
 * 
 * Split a array into two arrays , then sort both the array separately and then combine and print in the sorted order.
 * 
 */
public class Solution {

private static void splitArray(ArrayList<Integer> list, int k) {
	
	int N = list.size();
	for (int i = 0; i < N; i++) {
		
	}
	
}
	
public static void main(String[] args) {
	int[] array = new int[] {1,4,3,2,6,8,7};
	ArrayList<Integer> list = new ArrayList<>();
	 
for (int i = 0; i < array.length; i++) {
	list.add(array[i]);
}
	int splitValue = 3;
	Solution.splitArray(list, splitValue);

}


}