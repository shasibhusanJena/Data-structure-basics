package practiceExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Array1CombinationSum1 {

	public static void main(String[] args) {
		Integer[] arr = new Integer[]{2,4,6,8};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(Arrays.asList(arr));
		System.out.println(list);
	}
}
