package practiceExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Array1CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);
        
        return result;
    }
    
    private void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start){
    	if(target > 0){
    		for(int i = start; i < candidates.length && target >= candidates[i]; i++){
    			cur.add(candidates[i]);
    			getResult(result, cur, candidates, target - candidates[i], i);
    			cur.remove(cur.size() - 1);
    		}//for
    	}//if
    	else if(target == 0 ){
    		result.add(new ArrayList<Integer>(cur));
    	}//else if
    }
    
    public static void main(String[] args) {
		int[] arr ={2,3,2,5,9};
		int target = 10;
		Array1CombinationSum n1 = new Array1CombinationSum();
		List<List<Integer>> result = n1.combinationSum(arr, target);
		
		System.out.println(result);
//		for (List<Integer> list : result) {
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println("- -"+result.get(i));
//			}
//		}
		}
		
	}

