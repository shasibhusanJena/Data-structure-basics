package abc.ds;

import java.util.Iterator;

/**
 * Factorial using recursive and iterative way.
 * in case of recursive way - we use formula n*(n-1) and when value is 0 then exit using return 1
 * @author shjena
 *
 */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(iterativeFactorial(8));
		System.out.println(recursiveFactorial(8));
	}
	
	public static int iterativeFactorial(int num) {
		
		if (num == 0) {
			return 1;
		}
		int factorial =1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static int recursiveFactorial(int num) {
		if(num == 0) {
			return 1;
		}
		
		return num*recursiveFactorial(num-1);
	}

}
