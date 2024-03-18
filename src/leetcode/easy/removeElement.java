package leetcode.easy;

public class removeElement {
public int removeElement(int[] nums, int val) {
        
	int index = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[index] = nums[i];
            index++;
        }
    }
    return index;
}
    }
public static void main(String[] args) {
	int[] arr = {3,2,2,3};
	int[] arr1 = {0,1,2,2,3,0,4,2};
	int val  =3;
	int val1 =2;
	
	System.out.println(new removeElement().removeElement(arr, val));
	System.out.println(new removeElement().removeElement(arr1, val1));
	
}
}
