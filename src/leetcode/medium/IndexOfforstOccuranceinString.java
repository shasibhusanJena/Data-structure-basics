package leetcode.medium;

/**
 * 
 * @author shjena
 *
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 */
public class IndexOfforstOccuranceinString {

	
	public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length(); i++){
            if(needle.charAt(0) == haystack.charAt(i)) {
            	
                int j=0;
                System.out.println(i+"  "+j);
            	while(j < needle.length() ){
                        if(needle.charAt(j) == haystack.charAt(i))
                        	System.out.println(needle.charAt(j)+" "+haystack.charAt(i));
                            j++;
                            i++;
                }
            }
        }
        return 0;
    }
	public static void main(String[] args) {
		
		String haystack = "sadbutsad", needle = "sad" ;
		new IndexOfforstOccuranceinString().strStr(haystack, needle);
	}
}
