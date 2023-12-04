package abc.ds.top20;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

public class Array_revershArray {

	public static void main(String[] args) {
		int[] iarray = {1,2,3,4,5};
		String[] sarray = {"one","Two","three","four","Five"};
		
		System.out.println("Before"+Arrays.toString(iarray));
		ArrayUtils.reverse(iarray);
		System.out.println("After"+Arrays.toString(iarray));
		
		System.out.println("Before"+Arrays.toString(sarray));
		ArrayUtils.reverse(sarray);
		System.out.println("After"+Arrays.toString(sarray));
	}
}
