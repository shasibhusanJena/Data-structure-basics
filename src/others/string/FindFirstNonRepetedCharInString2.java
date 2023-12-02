package others.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author shjena
 * We need first Non repetitive char from the String value as input
 * Not working solution
 */
public class FindFirstNonRepetedCharInString2 {

	
	 public static void FirstNonRepeat(String s)
	  {
	 
	    for (int i = 0; i < s.length(); i++) {
	 

	      if (s.indexOf((s.charAt(i)), s.indexOf(s.charAt(i))) == -1) {
	        System.out.println("First non-repeating character is "+ s.charAt(i));
	        break;
	      }
	    }
	    return;
	  }
	  public static void main (String[] args) {
	    String s = "almamrp";
	    FirstNonRepeat(s);
	  }
	}