package simple_java;

class StringToInt {
public int myAtoi(String s) {

	long num = 0;
	int sign = 1;
	char[] chars = s.toCharArray();
	int i = 0;
	while (i < chars.length && chars[i] == ' ') {
		i++;
	}

	while (i < chars.length && (chars[i] == '-' || chars[i] == '+') ){
		sign = chars[i] == '-' ? -1 : 1;
		i++;
	}
	while (i < chars.length && chars[i] <= '9' && chars[i] >= '0') {
		num = num * 10 + chars[i] - '0';
		i++;
		if(num>Integer.MAX_VALUE && sign==1) {
			return sign* Integer.MAX_VALUE;
		}
		if(num>Integer.MAX_VALUE &&sign==-1) {
			return sign* Integer.MIN_VALUE;
		}

	}

	return (int) num * sign;
	}
public static void main(String[] args) {
	StringToInt str = new StringToInt();
	System.out.println(str.myAtoi("   -42"));
}
}