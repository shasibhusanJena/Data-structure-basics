package practiceExamples;

public class RemoveDuplicates {

	
public int removeDuplicates(int[] nums) {
    int[] temp = new int[nums.length] ;
    
    int counter = 0;
    temp[0] = nums[0];
    for(int i =1;i<nums.length-1; i++){
        if (nums[i-1] != nums[i] )
            {
        		counter++;
                temp[counter] = nums[i+1];
                System.out.println(nums[i]+" "+nums[i+1]+" "+temp[counter]+" "+counter);
            }
    }
    nums = temp;
    return nums.length;
}

	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,3,4,5};
		RemoveDuplicates a1 = new RemoveDuplicates();
		a1.removeDuplicates(arr);
	}
}
