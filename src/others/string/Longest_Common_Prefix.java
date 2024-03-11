package others.string;

import java.util.Arrays;

public class Longest_Common_Prefix {

public String longestCommonPrefix(String[] strs) {
	
	Arrays.sort(strs);
	String s1 = strs[0];
	String s2 = strs[strs.length-1];
	int idx =0;
	while (idx < s1.length() && idx < s2.length()) {
		if(s1.charAt(idx)==s2.charAt(idx)) {
			idx++;
		}else {
			break;
		}
	}
	
	return s1.substring(0,idx);
        
    }
	public static void main(String[] args) {
		
		String[] str = {"flower","flow","flight"};
		String longestCommonLength = new Longest_Common_Prefix().longestCommonPrefix(str);
		System.out.println("longest Common Length is :- "+longestCommonLength);
	}
}
