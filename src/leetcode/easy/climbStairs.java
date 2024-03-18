package leetcode.easy;

/*
 * 
 * 
 * To calculate the number of ways to climb the stairs, we can observe that when we are on the nth stair,
we have two options:
either we climbed one stair from the (n-1)th stair or
we climbed two stairs from the (n-2)th stair.

*/

public class climbStairs {
	public int climbStairs(int n) {
		if(n ==0 || n ==1) {
			return 1;
		}
		int prev =1 , curr =1;
		for(int i =2; i <=n ;i++) {
			int temp = curr;
			curr = prev + curr;
			prev = temp;
			
			System.out.println("curr "+curr+" prev "+prev);
		}
		return curr;
	}
	
public static void main(String[] args) {
	
	System.out.println(""+new climbStairs().climbStairs(4));
	}
}
