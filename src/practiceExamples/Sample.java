package practiceExamples;


public class Sample {

public void longestPallendrom(String s) {
	int size = s.length();
	
	int responseLen=0;;
	String str ="";
	for (int i = 0; i < s.length(); i++) {
		int left =i;
		int right =i;

		System.out.println("check for index location"+i+" char "+s.charAt(i));
		while((s.charAt(left)== s.charAt(right)) && (left>=i) && (right<=s.length())) {
			
			if((right-left +1)>responseLen) {
				
				responseLen =right-left+1;
				str = s.substring(left,right);
			}
			System.out.println("substring is"+s.substring(left,right+1));
			left = left-1;
			right =right+1;
			System.out.println("left "+left+" right "+right+" i "+i);
		}
	}
}
	
	public static void main(String[] args) {
	
		Sample s = new Sample();
		s.longestPallendrom("xyzabcbam");
}
}
