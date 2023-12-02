package practiceExamples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Distinct5 {
	
	public List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, 0);
	    return list;
	}

	private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
	    list.add(new ArrayList<>(tempList));
	    for(int i = start; i < nums.length; i++){
	        tempList.add(nums[i]);
	        backtrack(list, tempList, nums, i + 1);
	        tempList.remove(tempList.size() - 1);
	    }
	}
	
public static void main(String[] args) {

	int[] arr = {1,3,5,6,2};
	Distinct5 s1 = new Distinct5();
	List<List<Integer>> list =s1.subsets(arr);
	
	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
		List<Integer> list2 = (List<Integer>) iterator.next();
		System.out.println(list2);
	}
	
}

}
