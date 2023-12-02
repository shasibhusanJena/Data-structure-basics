package java.simple;

public class Palindrome1 {
public static void main(String[] args) {
	
	int n = 1234536;
	int length = (int)(Math.log10(n)+1);
	System.out.println(length);
	int midValue;
	if (length % 2 ==0)
		System.out.println("even");
	else
		System.out.println("odd");

}
}
