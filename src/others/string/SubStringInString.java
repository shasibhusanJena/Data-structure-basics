package others.string;

public class SubStringInString {

	public static boolean SubStringTemp(String subStr) {
		
		System.out.println("input is "+subStr);
		int arrLength = subStr.length();
		for (int i = 0; i < arrLength/2; i++) {
			
		if(subStr.charAt(i) != subStr.charAt(arrLength-i-1))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String str = "abacara";
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				
			boolean s =	SubStringTemp(str.substring(i,j+1)); 
			if(s ==true && str.substring(i,j+1).length()>=2)
				System.out.println("Pallendrom are "+str.substring(i,j+1));
			}
		}
		
	}
	
}
