package leetcode.medium;

import java.util.Iterator;

public class ReverseWords {

	public String revershWords(String str) {
		String strFinal ="";
		String[] s = str.trim().split("\\s+");
		
		for (int i= s.length-1; i >=0 ;i--) {
			strFinal = strFinal +s[i] + " ";
		}
		
		return strFinal;
	}
	public static void main(String[] args) {
		
		String str  = " a good   example ";
		String strFinal =new ReverseWords().revershWords(str);
		System.out.println("Reversh Word is  "+strFinal);
	}
}
