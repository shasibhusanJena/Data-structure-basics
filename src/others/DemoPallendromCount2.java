package others;

public class DemoPallendromCount2 {

	public static boolean  validateSbuStringPalendrom(String subStr) {
		int size = subStr.length();
		if(subStr.length() >1)
		{
			for (int i = 0; i < size/2; i++) {
				if(subStr.charAt(i) != subStr.charAt(size-i-1)) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// declare the String value as input.
		
	String str = "abcbadefmaar";
	boolean status=false;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (str.substring(i, j).length()>1) {
					
					 status =DemoPallendromCount2.validateSbuStringPalendrom(str.substring(i, j));

				}
						if(status == true) {
				System.out.println(str.substring(i, j)+" is a pallendrom ");
			}
			}
		}
	}
}
