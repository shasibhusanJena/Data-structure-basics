package others.string;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepetedChar {

	public int intFirstRepetedChar(int[] arr){
		
		Set<Integer> temp = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(temp.contains(arr[i])) {
				// then return the value.
				return arr[i];
			}
			else {
				
				temp.add(arr[i]);
			}
		}
		
		return 0;
		
	}
	public static void main(String[] args) {
	int[] arr = {1,2,3,4,4,5,6};
	FindFirstRepetedChar s1 = new FindFirstRepetedChar();
	int c = s1.intFirstRepetedChar(arr);
	System.out.println(c);
	}
}
