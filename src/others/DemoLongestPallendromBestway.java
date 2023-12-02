package others;

public class DemoLongestPallendromBestway {


	public static void main(String[] args) {
		// declare the String value as input.
		
		String str = "abxmxbr";
		String res ="";
		int resLength = 0;
		for (int i = 0; i < str.length(); i++) {
			int left = i;
			int right =i;
			
			while (left >= 0 && right< str.length() && str.charAt(left) == str.charAt(right) ){
				
				
				if((right - left+1) > resLength){
					res = str.substring(left,right+1);
					resLength = right -left+1;
					System.out.println("odd response "+res+" resLength  "+resLength);
				} 
				
				left =left-1;
				right=right+1;
			}
		}
	
	}
}
