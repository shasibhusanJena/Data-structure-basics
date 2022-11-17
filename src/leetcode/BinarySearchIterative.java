package leetcode;

public class BinarySearchIterative {

	public void searchIndexLocation(int[] arr,int firstElementIndex,int lastElementIndex,int to_find) {
		
	int midElementIndex = (firstElementIndex+lastElementIndex)/2;	
	while(firstElementIndex<=lastElementIndex) {
		if(arr[midElementIndex] < to_find) {
			firstElementIndex = midElementIndex+1;
			System.out.println("from if block "+arr[midElementIndex]);
		}
		else if(arr[midElementIndex] == to_find) {
			System.out.println("element is found at index location "+midElementIndex);
			break;
		}
		else {
			lastElementIndex = midElementIndex -1;
			System.out.println("from else block "+arr[midElementIndex]);
		}
		midElementIndex = (firstElementIndex+lastElementIndex)/2;
	}
	if(firstElementIndex >lastElementIndex) {
		System.out.println("element is not found");
	}
		
	}
	
	public static void main(String[] args) {
		int[] arr  = {1,3,5,6,9,10,13,18,19,20,22,23,28,29};
		BinarySearchIterative bn = new BinarySearchIterative();
		int firstElement = 0;
		int lastElement = arr.length-1;
		int to_find = 3;
		bn.searchIndexLocation(arr, firstElement,lastElement,to_find);
		
	}
}
