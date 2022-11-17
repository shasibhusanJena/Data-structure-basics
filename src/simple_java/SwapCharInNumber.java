package simple_java;
/**
 * 
 * @author shjena
 * Swap adjucent char from given number as input
 */
public class SwapCharInNumber {

	public void swapcharinNumber(char[] arr) {
		
		int mid =  (arr.length/2);
		System.out.println(arr.length);
		System.out.println("Middle value index is "+mid+" and value is "+arr[mid]);
		char temp = arr[mid-1];
		arr[mid-1] = arr[mid+1];
		arr[mid+1] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.print("\n");
	}
	public static void main(String[] args) {
		String str = "1123";
		SwapCharInNumber sc = new SwapCharInNumber();
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		System.out.print("Input value is ");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(" "+ch[i]);
		}
		System.out.print("\n");
		sc.swapcharinNumber(ch);
	}
}
