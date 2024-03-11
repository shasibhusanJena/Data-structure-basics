package others.string;

public class LengthOfLastWordCode {

	public int lengthOfLastWord(String s) {
			String[] str =s.split(" ");
			return str[str.length-1].length();
    }
	public static void main(String[] args) {
			String str = "   abc   def   gh    ijkl         ";
			System.out.println(new LengthOfLastWordCode().lengthOfLastWord(str));
	}
}
