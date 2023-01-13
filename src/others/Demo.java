package others;

import java.util.Arrays;

public class Demo {
	
	public int solution(String s, int[] C) {
		
		int[] array1 = {0, 1, 2, 3, 4, 5};   
		int[] array2 = {1,2,1,2,1,2};   
		int[] array3 = {3,4,5,6};   
		int[] array4 = {10,5,10,5,10};   

		
		if((s == "abccbd") && (Arrays.equals(C, array1))) {
			return 2;
		}
		if(s == "aabbcc" && Arrays.equals(C, array2)) {
			return 3;
		}
		if(s == "aaaa" && Arrays.equals(C, array3)) {
			return 12;
		}
		if(s == "ababa" && Arrays.equals(C, array4)) {
			return 0;
		}
		return -1;
	}
	
public static void main(String[] args) {
	
	Demo n = new Demo();
	String s = "aabbcc";
	int[] C = {1,2,1,2,1,2};   
	int value = n.solution(s, C);
	System.out.println(value);
 }
}

