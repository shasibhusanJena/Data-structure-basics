package leetcode.easy;

public class PallendromNumber {

	public  static boolean checkPallendromWithoutConvertToString(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
            
        }
        System.out.println("reversh "+reversed+" "+"x "+x);
        return (x == reversed) || (x == reversed / 10);
	}
	public static void checkPallendromWithConvertToString(int x) {
		
		String y = Integer.toString(x);
		StringBuffer str = new StringBuffer(y);
		if (y.equals(str.reverse().toString())) {
			System.out.println("is pallendrom");
		}
	}
	public static void main(String[] args) {
		
		int number =121;
		checkPallendromWithConvertToString(number);
		boolean status =checkPallendromWithoutConvertToString(number);
		System.out.println(status);
	}
}
