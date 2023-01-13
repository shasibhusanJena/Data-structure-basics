package practiceExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCombinationSum1 {

	public static void main(String[] args) {
		int[] arr = new int[]{2,4,6,8};
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(Arrays.asList(arr));
		System.out.println(list);
	}
}
