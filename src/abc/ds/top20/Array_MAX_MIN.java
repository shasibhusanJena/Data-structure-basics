package abc.ds.top20;

/**
 * 
 * @author shjena
 * Initially, the largest is initialized with Integer.MIN_VALUE and smallest are initialized with Integer.MAX_VALUE.In each iteration of the loop, we compare the current number with the largest and smallest and update them accordingly.
Since if a number is larger than the largest, it can't be smaller than the smallest, which means you don't need to check if the first condition is true, that's why we have used if-else code block, 
where else part will only execute if the first condition is not true.
 */
public class Array_MAX_MIN {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {1,2,3,4,4,4,5,5,6};
		
		Integer MAX = Integer.MIN_VALUE;
		Integer MIN = Integer.MAX_VALUE;
		
		for(int i=0;i< arr.length;i++) {
			
			if(arr[i] > MAX) {
				MAX = arr[i];
			}
			if (arr[i] < MIN) {
				MIN = arr[i];
			}
		}
		System.out.println("MAX "+MAX+" MIN "+MIN);
	}
}
