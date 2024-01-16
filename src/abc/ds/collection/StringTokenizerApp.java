package abc.ds.collection;
import java.util.StringTokenizer;
/*
 * 
 * StringTokenizer with Multiple Delimiter 
 */
public class StringTokenizerApp {
public static void main(String[] args) {
	String msg = "http://10.123.43.67:80/";
    StringTokenizer st = new StringTokenizer(msg,"://.");
    System.out.println("Print count of the tokens  "+st.countTokens());
    
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
    }
    
    
}
}
