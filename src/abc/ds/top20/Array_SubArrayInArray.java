package abc.ds.top20;

/*
 * Naive method with three for loop to print all the subarray in the array
 */
public class Array_SubArrayInArray {

	static int[] array = new int[] {1,2,3,4};
	static void subArray() {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(array[k]+" ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		subArray();
	}
}
