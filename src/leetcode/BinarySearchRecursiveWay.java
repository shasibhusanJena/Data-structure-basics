package leetcode;

public class BinarySearchRecursiveWay {

	public int rec_binary_search(int[] arr, int left, int right, int to_find) {
		if(right >=left) {
			int mid = (left+right)/2;
			if(arr[mid] == to_find) {
				return mid;
			}
			if(arr[mid] < to_find) {
				return rec_binary_search(arr, mid+1, right, to_find);
			}
			if(arr[mid] < to_find) {
				return rec_binary_search(arr, left, mid-1, to_find);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		BinarySearchRecursiveWay b1 = new BinarySearchRecursiveWay();
		int[] arr = {1,2,4,5,6,7,9};
		int left =0;
		int right = arr.length-1;
		int to_find =7;
		int indexLoc =b1.rec_binary_search(arr, left, right, to_find);
		System.out.println("Index location of "+to_find+" is "+indexLoc);
	}
}
