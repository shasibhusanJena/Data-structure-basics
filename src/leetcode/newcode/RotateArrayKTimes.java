package leetcode.newcode;


/**
 * 
 * @author shjena
 * Time complexity : O(n) 
 * Auxiliary Space : O(1)
 * Print array after it is right rotated K times
 */
public class RotateArrayKTimes {
	
public static void rotate(int[] arr, int k) {
        
		int arrayLength = arr.length;
        k =k %arrayLength;
        System.out.println("k : "+k);
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i<k) {
				
				System.out.println(arr[arrayLength +i -k]);
			}else {
				System.out.println(arr[i-k]);
			}
        }
    }
	
	public static void rotateArraybyKIndex(int[] arr,int k, int arrayLength) {
		
		k =k %arrayLength;
		System.out.println("k : "+k);
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i<k) {
				
				System.out.println(arr[arrayLength +i -k]);
			}else {
				System.out.println(arr[i-k]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[]  array = new int[] {1,2,3,4,5,6,7,8,9};
		
		rotateArraybyKIndex(array, 4, array.length);
		rotate(array, 4);
	}
}
