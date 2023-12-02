package practiceExamples;

import java.util.Arrays;

// there are 4 people want to rescue , boat max weight can be 7, what is the combination of the weights to rescue.

public class ArrayBoatProb {
public static int[] boatSubMember(int[] arr,int maxweight) {
	int start =0;
	int last = arr.length;
	if(arr.length <=1) {
		return arr;
	}
	for (int i = 0; i < last; i++) {
		if(arr[i]+ arr[last-i] <maxweight ) {
			System.out.println(arr[i]+" - "+arr[last-i]);
			i++;
		}
		last = last-1;
		
	}
	return null;
}
	public static void main(String[] args) {
	int[] arr = new int[] {1};
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	int maxweight =7;
	int[] arr1 =ArrayBoatProb.boatSubMember(arr, maxweight);
		
	}
}
