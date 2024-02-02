package leetcode.newcode;

public class Permutations {
	
	
private static void printAllPermutation(String s, String ans) {
	// TODO Auto-generated method stub
	
	if(s.length() ==0) {
		System.out.println(ans+" ");
		return;
	}
	for (int i = 0; i < s.length(); i++) {
		char ch  = s.charAt(i);
		// Rest of the string after excluding the ith char
		String ros = s.substring(0,i) + s.substring(i+1);
		
		// Recursive call
		printAllPermutation(ros,ans+ch );
	}
	
}
public static void main(String[] args) {
	
	String s = "abb";
	printAllPermutation(s,"");
	}
}
