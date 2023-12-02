package practiceExamples;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSplitSubArrayList {
	
	public static List<List<Integer>> subArrayList(ArrayList<Integer> list,int splitLength){
		int arrayLength = list.size();
		List<List<Integer>> parts = new ArrayList<List<Integer>>();
		
		for (int i = 0; i < arrayLength; i=i+splitLength) {
			parts.add(new ArrayList<Integer>(
					list.subList(i, Math.min(arrayLength, i+splitLength))
					)
			);
		}
		return parts;
	}
	
public static void main(String[] args) {
	// create a array
	Integer[] arr = new Integer[] {3,6,5,4,9,8,1};
	int splitLength =3;
		
	// add value to arrayList  asList method
	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
	
	//call subArrayList method
	List<List<Integer>>  parts =ArrayListSplitSubArrayList.subArrayList(list,splitLength); 
	// printValue
	
	System.out.println(parts);
}
}
