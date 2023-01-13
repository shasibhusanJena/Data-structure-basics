package others;

public class Solution1 {

	public boolean checkDuplicateValue(int[] arr) {
		 for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    return true;
	            }  
	        }  
		 return false;
	} 
	public int solution(int[] arr) {
		int sum =0;
		if(arr.length >1) {
			
			if(checkDuplicateValue(arr) == true) {
				int sumFirstPair = arr[0]+arr[1];
				int sumSecondPair = arr[2]+arr[3];
				if(sumFirstPair < sumSecondPair) {
					return sumSecondPair;
				}else {
					return sumFirstPair;
				}
			}
			else {
				System.out.println(arr[0]+" "+arr[arr.length-1]);
				sum = arr[0] +arr[arr.length-1];
				return sum;

			}
					}
		return -1;
		
	}
	
	public static void main(String[] args) {
	
	int[] arr = {130,191,200,200};
	Solution1 s = new Solution1();
	int status = s.solution(arr);
	System.out.println("Sum is "+status);
	
}
}
