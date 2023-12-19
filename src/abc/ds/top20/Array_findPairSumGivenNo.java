package abc.ds.top20;



public class Array_findPairSumGivenNo {

	static int[] arr = new int[] {1,2,3,4,5,7,9};
	static int findSUM = 8;
	// find various pairs of the combinations and check sum

	// here complexity is O(n pow 2)
	public static void findUsingBruitforceTech() {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(findSUM == (arr[i]+arr[j])) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
	
	// accepted complexity is O(n) or O(1). try finding this
	public static void findUsingbestapproach() {
		
	}
	public static void main(String[] args) {
		
		findUsingBruitforceTech();
	}
}
